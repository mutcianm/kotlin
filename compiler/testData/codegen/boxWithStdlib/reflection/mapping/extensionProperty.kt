import kotlin.reflect.jvm.*

class K(var value: Long)

var K.ext: Double
    get() = value.toDouble()
    set(value) {
        this.value = value.toLong()
    }

fun box(): String {
    val p = K::ext

    assert(p.javaField == null, "Fail p field")

    val getter = p.javaGetter!!
    val setter = p.javaSetter!!
    val k = K(42L)
    assert(getter.invoke(null, k) == 42.0, "Fail k getter")
    setter.invoke(null, k, -239.0)
    assert(getter.invoke(null, k) == -239.0, "Fail k setter")

    return "OK"
}
