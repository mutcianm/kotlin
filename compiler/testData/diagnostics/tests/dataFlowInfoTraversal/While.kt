fun bar(x: Int): Int = x + 1

fun foo() {
    val x: Int? = null
    while (x == null) {
        bar(<!TYPE_MISMATCH!>x<!>)
    }
    bar(<!DEBUG_INFO_AUTOCAST!>x<!>)
    
    val y: Int? = null
    while (y != null) {
        bar(<!DEBUG_INFO_AUTOCAST!>y<!>)
    }
    bar(<!TYPE_MISMATCH!>y<!>)
    
    val z: Int? = null
    while (z == null) {
        bar(<!TYPE_MISMATCH!>z<!>)
        break
    }
    bar(<!TYPE_MISMATCH!>z<!>)
}