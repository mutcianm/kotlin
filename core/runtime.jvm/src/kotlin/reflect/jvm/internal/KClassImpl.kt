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

package kotlin.reflect.jvm.internal

trait KClassImpl<out T> : KClass<T> {
    val jClass: Class<T>

    fun memberProperty(name: String): KMemberProperty<T, Any?>

    fun mutableMemberProperty(name: String): KMutableMemberProperty<T, Any?>
}

class KKotlinClass<out T>(override val jClass: Class<T>) : KClassImpl<T> {
    override fun memberProperty(name: String) = KMemberPropertyImpl<T, Any?>(name, this)

    override fun mutableMemberProperty(name: String) = KMutableMemberPropertyImpl<T, Any?>(name, this)
}

class KForeignClass<out T>(override val jClass: Class<T>) : KClassImpl<T> {
    override fun memberProperty(name: String) = KForeignMemberProperty<T, Any?>(name, this)

    override fun mutableMemberProperty(name: String) = KMutableForeignMemberProperty<T, Any?>(name, this)
}
