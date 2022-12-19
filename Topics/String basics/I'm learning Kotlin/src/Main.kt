fun sum(a: Int, b: Int): Int {
    val result = a + b
    return result
}

fun main() {
    val result1 = sum(2, 5)
    println(result1) // 7

    val result2 = sum(result1, 4)
    println(result2) // 11
}