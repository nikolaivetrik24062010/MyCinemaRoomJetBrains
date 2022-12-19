fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()

    println(if (num2 == 0) "Division by zero, please fix the second argument!" else num1 / num2)
}
