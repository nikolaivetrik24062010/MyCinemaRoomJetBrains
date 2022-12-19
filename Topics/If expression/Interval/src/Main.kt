fun main() {
    val number = readln().toInt()
    println(
        if (
            number > -15 && number <= 12 ||
            number > 14 && number < 17 ||
            number >= 19
        ) {
            "True"
        } else {
            "False"
        }
    )
}