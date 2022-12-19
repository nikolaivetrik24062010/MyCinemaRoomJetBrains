private const val TRIANGLE_SIDES_COUNT = 3

fun main() {
    val (a, b, c) = Array(TRIANGLE_SIDES_COUNT) { readln().toInt() }
    println(if (a + b > c && a + c > b && b + c > a) "YES" else "NO")
}
