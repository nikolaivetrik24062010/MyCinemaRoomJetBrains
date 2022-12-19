fun main() {
    val n = readLine()!!.toInt()

    var dem: Int = 0
    for (i in 1..n) {
        repeat(i) {
            dem++
            if (dem <= n) {
                print("$i ")
            }

        }
    }
}