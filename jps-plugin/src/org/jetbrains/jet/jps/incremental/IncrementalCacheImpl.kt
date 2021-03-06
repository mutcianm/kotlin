/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.jps.incremental

import org.jetbrains.jet.jps.incremental.IncrementalCacheImpl.RecompilationDecision.*
import java.io.File
import com.intellij.util.io.PersistentHashMap
import java.io.DataOutput
import com.intellij.util.io.IOUtil
import java.io.DataInput
import org.jetbrains.jet.lang.resolve.name.FqName
import com.intellij.util.io.DataExternalizer
import org.jetbrains.jet.lang.resolve.kotlin.VirtualFileKotlinClass
import org.jetbrains.jet.lang.resolve.kotlin.header.KotlinClassHeader
import org.jetbrains.jet.descriptors.serialization.BitEncoding
import org.jetbrains.jet.utils.intellij.*
import java.util.Arrays
import org.jetbrains.org.objectweb.asm.*
import com.intellij.util.io.EnumeratorStringDescriptor
import org.jetbrains.jet.lang.resolve.java.JvmAnnotationNames
import org.jetbrains.jet.lang.resolve.java.JvmClassName
import java.util.HashSet
import org.jetbrains.jet.lang.resolve.kotlin.incremental.cache.IncrementalCache
import java.util.HashMap
import org.jetbrains.jet.lang.resolve.java.PackageClassUtils
import com.intellij.util.containers.MultiMap
import com.intellij.openapi.util.io.FileUtil
import java.security.MessageDigest
import org.jetbrains.jps.incremental.storage.StorageOwner
import org.jetbrains.jps.builders.storage.StorageProvider
import java.io.IOException

val INLINE_ANNOTATION_DESC = "Lkotlin/inline;"

public class IncrementalCacheImpl(val baseDir: File): StorageOwner, IncrementalCache {
    class object {
        val PROTO_MAP = "proto.tab"
        val CONSTANTS_MAP = "constants.tab"
        val INLINE_FUNCTIONS = "inline-functions.tab"
        val PACKAGE_PARTS = "package-parts.tab"
    }

    private val protoMap = ProtoMap()
    private val constantsMap = ConstantsMap()
    private val inlineFunctionsMap = InlineFunctionsMap()
    private val packagePartMap = PackagePartMap()

    private val maps = listOf(protoMap, constantsMap, inlineFunctionsMap, packagePartMap)

    public fun saveFileToCache(sourceFiles: Collection<File>, classFile: File): RecompilationDecision {
        val fileBytes = classFile.readBytes()
        val classNameAndHeader = VirtualFileKotlinClass.readClassNameAndHeader(fileBytes)
        if (classNameAndHeader == null) return DO_NOTHING

        val (className, header) = classNameAndHeader
        val annotationDataEncoded = header.annotationData
        if (annotationDataEncoded != null) {
            val data = BitEncoding.decodeBytes(annotationDataEncoded)
            when (header.kind) {
                KotlinClassHeader.Kind.PACKAGE_FACADE -> {
                    return if (protoMap.put(className, data)) COMPILE_OTHERS else DO_NOTHING
                }
                KotlinClassHeader.Kind.CLASS -> {
                    val inlinesChanged = inlineFunctionsMap.process(className, fileBytes)
                    val protoChanged = protoMap.put(className, data)
                    val constantsChanged = constantsMap.process(className, fileBytes)

                    return if (inlinesChanged) RECOMPILE_ALL else if (protoChanged || constantsChanged) COMPILE_OTHERS else DO_NOTHING
                }
                else -> {
                    throw IllegalStateException("Unexpected kind with annotationData: ${header.kind}")
                }
            }
        }
        if (header.syntheticClassKind == JvmAnnotationNames.KotlinSyntheticClass.Kind.PACKAGE_PART) {
            assert(sourceFiles.size == 1) { "Package part from several source files: $sourceFiles" }
            packagePartMap.putPackagePartSourceData(sourceFiles.first(), className)
            val inlinesChanged = inlineFunctionsMap.process(className, fileBytes)
            val constantsChanged = constantsMap.process(className, fileBytes)
            return if (inlinesChanged) RECOMPILE_ALL else if (constantsChanged) COMPILE_OTHERS else DO_NOTHING
        }

        return DO_NOTHING
    }

    public fun clearCacheForRemovedFiles(removedSourceFiles: Collection<String>, outDirectory: File) {
        removedSourceFiles.forEach { packagePartMap.remove(it) }

        inlineFunctionsMap.clearOutdated(outDirectory)
        constantsMap.clearOutdated(outDirectory)
        protoMap.clearOutdated(outDirectory)
    }

    public override fun getRemovedPackageParts(compiledSourceFilesToFqName: Map<File, String>): Collection<String> {
        return packagePartMap.getRemovedPackageParts(compiledSourceFilesToFqName)
    }

    public override fun getPackageData(fqName: String): ByteArray? {
        return protoMap[JvmClassName.byFqNameWithoutInnerClasses(PackageClassUtils.getPackageClassFqName(FqName(fqName)))]
    }

    override fun flush(memoryCachesOnly: Boolean) {
        maps.forEach { it.flush(memoryCachesOnly) }
    }

    public override fun clean() {
        maps.forEach { it.clean() }
    }

    public override fun close() {
        maps.forEach { it.close () }
    }

    private abstract class BasicMap<V> {
        protected var map: PersistentHashMap<String, V> = createMap()

        protected abstract fun createMap(): PersistentHashMap<String, V>

        public fun clean() {
            try {
                map.close()
            }
            catch (ignored: IOException) {
            }

            PersistentHashMap.deleteFilesStartingWith(map.getBaseFile()!!)
            try {
                map = createMap()
            }
            catch (ignored: IOException) {
            }
        }

        public fun flush(memoryCachesOnly: Boolean) {
            if (memoryCachesOnly) {
                if (map.isDirty()) {
                    map.dropMemoryCaches()
                }
            }
            else {
                map.force()
            }
        }

        public fun close() {
            map.close()
        }
    }

    private abstract class ClassFileBasedMap<V>: BasicMap<V>() {

        // TODO may be too expensive, because it traverses all files in out directory
        public fun clearOutdated(outDirectory: File) {
            val keysToRemove = HashSet<String>()

            map.processKeysWithExistingMapping { key ->
                val className = JvmClassName.byInternalName(key!!)
                val classFile = File(outDirectory, FileUtil.toSystemDependentName(className.getInternalName()) + ".class")
                if (!classFile.exists()) {
                    keysToRemove.add(key)
                }

                true
            }

            for (key in keysToRemove) {
                map.remove(key)
            }
        }
    }

    private inner class ProtoMap: ClassFileBasedMap<ByteArray>() {
        override fun createMap(): PersistentHashMap<String, ByteArray> = PersistentHashMap(
                File(baseDir, PROTO_MAP),
                EnumeratorStringDescriptor(),
                ByteArrayExternalizer
        )

        public fun put(className: JvmClassName, data: ByteArray): Boolean {
            val key = className.getInternalName()
            val oldData = map[key]
            if (Arrays.equals(data, oldData)) {
                return false
            }
            map.put(key, data)
            return true
        }

        public fun get(className: JvmClassName): ByteArray? {
            return map[className.getInternalName()]
        }
    }

    private inner class ConstantsMap: ClassFileBasedMap<Map<String, Any>>() {
        override fun createMap(): PersistentHashMap<String, Map<String, Any>> = PersistentHashMap(
                File(baseDir, CONSTANTS_MAP),
                EnumeratorStringDescriptor(),
                ConstantsMapExternalizer
        )

        private fun getConstantsMap(bytes: ByteArray): Map<String, Any> {
            val result = HashMap<String, Any>()

            ClassReader(bytes).accept(object : ClassVisitor(Opcodes.ASM5) {
                override fun visitField(access: Int, name: String, desc: String, signature: String?, value: Any?): FieldVisitor? {
                    val staticFinal = Opcodes.ACC_STATIC or Opcodes.ACC_FINAL
                    if (value != null && access and staticFinal == staticFinal) {
                        result[name] = value
                    }
                    return null
                }
            }, ClassReader.SKIP_CODE or ClassReader.SKIP_DEBUG or ClassReader.SKIP_FRAMES)

            return result
        }

        public fun process(className: JvmClassName, bytes: ByteArray): Boolean {
            return put(className, getConstantsMap(bytes))
        }

        private fun put(className: JvmClassName, constantsMap: Map<String, Any>): Boolean {
            val key = className.getInternalName()

            val oldMap = map[key]
            if (oldMap == constantsMap) {
                return false
            }
            map.put(key, constantsMap)
            return true
        }
    }

    private object ConstantsMapExternalizer: DataExternalizer<Map<String, Any>> {
        override fun save(out: DataOutput, map: Map<String, Any>?) {
            out.writeInt(map!!.size)
            for (name in map.keySet().toSortedList()) {
                IOUtil.writeString(name, out)
                val value = map[name]!!
                when (value) {
                    is Int -> {
                        out.writeByte(Kind.INT.ordinal())
                        out.writeInt(value)
                    }
                    is Float -> {
                        out.writeByte(Kind.FLOAT.ordinal())
                        out.writeFloat(value)
                    }
                    is Long -> {
                        out.writeByte(Kind.LONG.ordinal())
                        out.writeLong(value)
                    }
                    is Double -> {
                        out.writeByte(Kind.DOUBLE.ordinal())
                        out.writeDouble(value)
                    }
                    is String -> {
                        out.writeByte(Kind.STRING.ordinal())
                        IOUtil.writeString(value, out)
                    }
                    else -> throw IllegalStateException("Unexpected constant class: ${value.javaClass}")
                }
            }
        }

        override fun read(`in`: DataInput): Map<String, Any>? {
            val size = `in`.readInt()
            val map = HashMap<String, Any>(size)

            for (i in size.indices) {
                val name = IOUtil.readString(`in`)!!

                val kind = Kind.values()[`in`.readByte().toInt()]
                val value = when (kind) {
                    Kind.INT -> `in`.readInt()
                    Kind.FLOAT -> `in`.readFloat()
                    Kind.LONG -> `in`.readLong()
                    Kind.DOUBLE -> `in`.readDouble()
                    Kind.STRING -> IOUtil.readString(`in`)!!
                }
                map[name] = value
            }

            return map
        }

        private enum class Kind {
            INT FLOAT LONG DOUBLE STRING
        }
    }

    private inner class InlineFunctionsMap: ClassFileBasedMap<Map<String, Long>>() {
        override fun createMap(): PersistentHashMap<String, Map<String, Long>> = PersistentHashMap(
                File(baseDir, INLINE_FUNCTIONS),
                EnumeratorStringDescriptor(),
                InlineFunctionsMapExternalizer
        )

        private fun getInlineFunctionsMap(bytes: ByteArray): Map<String, Long>? {
            val result = HashMap<String, Long>()

            ClassReader(bytes).accept(object : ClassVisitor(Opcodes.ASM5) {
                override fun visitMethod(access: Int, name: String, desc: String, signature: String?, exceptions: Array<out String>?): MethodVisitor? {
                    val dummyClassWriter = ClassWriter(Opcodes.ASM5)
                    return object : MethodVisitor(Opcodes.ASM5, dummyClassWriter.visitMethod(0, name, desc, null, exceptions)) {
                        var hasInlineAnnotation = false

                        override fun visitAnnotation(desc: String, visible: Boolean): AnnotationVisitor? {
                            if (desc == INLINE_ANNOTATION_DESC) {
                                hasInlineAnnotation = true
                            }
                            return null
                        }

                        override fun visitEnd() {
                            if (hasInlineAnnotation) {
                                val dummyBytes = dummyClassWriter.toByteArray()!!
                                val hash = dummyBytes.md5()

                                result[name + desc] = hash
                            }
                        }
                    }
                }

            }, 0)

            return if (result.isEmpty()) null else result
        }

        public fun process(className: JvmClassName, bytes: ByteArray): Boolean {
            return put(className, getInlineFunctionsMap(bytes))
        }

        private fun put(className: JvmClassName, inlineFunctionsMap: Map<String, Long>?): Boolean {
            val key = className.getInternalName()

            val oldMap = map[key]
            if (oldMap == inlineFunctionsMap) {
                return false
            }
            if (inlineFunctionsMap != null) {
                map.put(key, inlineFunctionsMap)
            }
            return true
        }
    }

    private object InlineFunctionsMapExternalizer: DataExternalizer<Map<String, Long>> {
        override fun save(out: DataOutput, map: Map<String, Long>?) {
            out.writeInt(map!!.size)
            for (name in map.keySet()) {
                IOUtil.writeString(name, out)
                out.writeLong(map[name]!!)
            }
        }

        override fun read(`in`: DataInput): Map<String, Long>? {
            val size = `in`.readInt()
            val map = HashMap<String, Long>(size)

            for (i in size.indices) {
                val name = IOUtil.readString(`in`)!!
                val value = `in`.readLong()

                map[name] = value
            }

            return map
        }

    }


    private inner class PackagePartMap: BasicMap<String>() {
        // Format of serialization to string: <source file path>  -->  <package part JVM internal name>
        override fun createMap(): PersistentHashMap<String, String> = PersistentHashMap(
                File(baseDir, PACKAGE_PARTS),
                EnumeratorStringDescriptor(),
                EnumeratorStringDescriptor()
        )

        public fun putPackagePartSourceData(sourceFile: File, className: JvmClassName) {
            map.put(sourceFile.getAbsolutePath(), className.getInternalName())
        }

        public fun remove(sourceFile: String) {
            map.remove(sourceFile)
        }

        public fun getRemovedPackageParts(compiledSourceFilesToFqName: Map<File, String>): Collection<String> {
            val result = HashSet<String>()

            map.processKeysWithExistingMapping { key ->
                val sourceFile = File(key!!)

                val packagePartClassName = map[key]!!
                if (!sourceFile.exists()) {
                    result.add(packagePartClassName)
                }
                else {
                    val previousPackageFqName = JvmClassName.byInternalName(packagePartClassName).getFqNameForClassNameWithoutDollars().parent()
                    val currentPackageFqName = compiledSourceFilesToFqName[sourceFile]
                    if (currentPackageFqName != null && currentPackageFqName != previousPackageFqName.asString()) {
                        result.add(packagePartClassName)
                    }
                }

                true
            }

            return result
        }

        public fun getPackages(): Set<FqName> {
            val result = HashSet<FqName>()

            map.processKeysWithExistingMapping { key ->
                val packagePartClassName = map[key!!]!!

                val packageFqName = JvmClassName.byInternalName(packagePartClassName).getFqNameForClassNameWithoutDollars().parent()

                result.add(packageFqName)

                true
            }

            return result
        }
    }

    enum class RecompilationDecision {
        DO_NOTHING
        COMPILE_OTHERS
        RECOMPILE_ALL

        fun merge(other: RecompilationDecision): RecompilationDecision {
            return if (other.ordinal() > this.ordinal()) other else this
        }
    }
}

public object IncrementalCacheStorageProvider : StorageProvider<IncrementalCacheImpl>() {
    override fun createStorage(targetDataDir: File?): IncrementalCacheImpl {
        return IncrementalCacheImpl(File(targetDataDir, "kotlin"))
    }
}

private fun ByteArray.md5(): Long {
    val d = MessageDigest.getInstance("MD5").digest(this)!!
    return ((d[0].toLong() and 0xFFL)
                    or ((d[1].toLong() and 0xFFL) shl 8)
                    or ((d[2].toLong() and 0xFFL) shl 16)
                    or ((d[3].toLong() and 0xFFL) shl 24)
                    or ((d[4].toLong() and 0xFFL) shl 32)
                    or ((d[5].toLong() and 0xFFL) shl 40)
                    or ((d[6].toLong() and 0xFFL) shl 48)
                    or ((d[7].toLong() and 0xFFL) shl 56)
            )
}

private object ByteArrayExternalizer: DataExternalizer<ByteArray> {
    override fun save(out: DataOutput, value: ByteArray?) {
        out.writeInt(value!!.size)
        out.write(value)
    }

    override fun read(`in`: DataInput): ByteArray {
        val length = `in`.readInt()
        val buf = ByteArray(length)
        `in`.readFully(buf)
        return buf
    }
}
