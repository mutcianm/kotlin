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

import java.lang.reflect.*

// TODO: properties of built-in classes

open class KMemberPropertyImpl<T : Any, out R>(
        public override val name: String,
        protected val owner: KKotlinClass<T>
) : KMemberProperty<T, R>, KPropertyImpl<R> {
    override val field: Field?
        get() = try {
            owner.jClass.getDeclaredField(name)
        }
        catch (e: NoSuchFieldException) {
            null
        }

    // TODO: extract, make lazy (weak?), use our descriptors knowledge
    override val getter: Method = owner.jClass.getMaybeDeclaredMethod(getterName(name))

    override fun get(receiver: T): R {
        return getter(receiver) as R
    }
}

class KMutableMemberPropertyImpl<T : Any, R>(
        name: String,
        owner: KKotlinClass<T>
) : KMutableMemberProperty<T, R>, KMutablePropertyImpl<R>, KMemberPropertyImpl<T, R>(name, owner) {
    override val setter: Method = owner.jClass.getMaybeDeclaredMethod(setterName(name), getter.getReturnType()!!)

    override fun set(receiver: T, value: R) {
        setter(receiver, value)
    }
}



open class KForeignMemberProperty<T : Any, out R>(
        public override val name: String,
        protected val owner: KForeignClass<T>
) : KMemberProperty<T, R>, KPropertyImpl<R> {
    override val field: Field = owner.jClass.getField(name)

    override val getter: Method? = null

    override fun get(receiver: T): R {
        return field.get(receiver) as R
    }
}

class KMutableForeignMemberProperty<T : Any, out R>(
        name: String,
        owner: KForeignClass<T>
) : KMutableMemberProperty<T, R>, KMutablePropertyImpl<R>, KForeignMemberProperty<T, R>(name, owner) {
    override val setter: Method? = null

    override fun set(receiver: T, value: R) {
        field.set(receiver, value)
    }
}
