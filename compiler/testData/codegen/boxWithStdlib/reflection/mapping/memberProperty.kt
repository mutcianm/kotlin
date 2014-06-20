import kotlin.reflect.jvm.*

class K(var value: Long)

fun box(): String {
    val p = K::value

    assert(p.javaField != null, "Fail p field")

    val getter = p.javaGetter!!
    val setter = p.javaSetter!!
    val k = K(42L)
    assert(getter.invoke(k) == 42L, "Fail k getter")
    setter.invoke(k, -239L)
    assert(getter.invoke(k) == -239L, "Fail k setter")

    return "OK"
}
