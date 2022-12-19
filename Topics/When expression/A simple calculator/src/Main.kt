fun main() {
    val (a, operator, b) = readln().split(' ')
    val first = a.toLong()
    val second = b.toLong()
    println(
        when (operator) {
            "+" -> first + second
            "-" -> first - second
            "/" -> if (second == 0L) "Division by 0!" else first / second
            "*" -> first * second
            else -> "Unknown operator"
        }
    )
}