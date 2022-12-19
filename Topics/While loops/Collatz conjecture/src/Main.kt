const val THREE = 3
const val ONE = 1
const val TWO = 2
fun main() {
    var num = readln().toInt()
    print("$num ")
    while (num != 1) {
        if (num % TWO == 0) {
            num /= TWO
        } else {
            num = num * THREE + ONE
        }
        print("$num ")
    }
}
