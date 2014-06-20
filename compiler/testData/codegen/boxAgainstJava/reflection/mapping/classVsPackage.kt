import classVsPackage as J

import java.lang.reflect.*
import kotlin.reflect.jvm.*

fun box(): String {
    // Check that KClass is created for Java class, not KPackage
    assert(javaClass<J>().kotlinClass != null, "Fail J class")
    assert(javaClass<J>().toKotlinPackage() == null, "Fail J package")

    // Check that KPackage is created for Kotlin package, not KClass
    val defaultPackage = Class.forName("_DefaultPackage") as Class<Any?>
    assert(defaultPackage.kotlinClass == null, "Fail _DefaultPackage class")
    assert(defaultPackage.toKotlinPackage() != null, "Fail _DefaultPackage package")
    
    return "OK"
}
