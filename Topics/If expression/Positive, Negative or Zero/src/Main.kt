fun main() {
    val num = readln().toInt()
    println(
        if (num < 0) "negative"
        else if (num > 0) "positive"
        else "zero"
    )
}
