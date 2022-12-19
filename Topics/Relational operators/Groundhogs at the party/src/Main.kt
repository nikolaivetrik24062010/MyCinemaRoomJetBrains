fun main() {
    val cups = readln().toInt()
    val weekends = readln().toBoolean()
    println(weekends && cups in 15..25 || !weekends && cups in 10..20)
}
