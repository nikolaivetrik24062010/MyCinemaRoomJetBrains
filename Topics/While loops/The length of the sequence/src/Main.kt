fun main() {
    var count = 0
    val input = 0
    do {
        val input = readln().toInt()
        if (input > 0) {
            count++
        }
    } while (input != 0)
    println(count)
}