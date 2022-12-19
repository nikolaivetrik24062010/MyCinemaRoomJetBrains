fun main() {
    var sum = 0
    do {
        val n = readln().toInt()
        sum += n
    } while (n > 0)
    println(sum)
}