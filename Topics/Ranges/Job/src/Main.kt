fun main() {
    val age = readln().toInt()
    val range = 18..59
    if (age in range) {
        println(true)
    } else {
        println(false)
    }
}