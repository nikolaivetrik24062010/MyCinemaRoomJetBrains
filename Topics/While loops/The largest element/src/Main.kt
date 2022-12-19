fun main() {
    var num = 0
    do {
        val inputNumber = readln().toInt()
        if (num < inputNumber) {
            num = inputNumber
        }
    } while (inputNumber != 0)
    println(num)
}