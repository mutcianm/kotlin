// PARAM_TYPES: kotlin.Int
// PARAM_TYPES: kotlin.Int
trait T

class A(a: Int, b: Int): T

class B(a: Int, b: Int): T by A(<selection>a + b</selection>, a - b)