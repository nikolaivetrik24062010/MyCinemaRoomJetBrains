fun main() {
    val in1 = readln().toInt()
    val in2 = readln().toInt()
    val in3 = readln().toInt()
    val in4 = readln().toInt()
    val in5 = readln().toInt()
    val range1and2 = in1..in2
    val range3and4 = in3..in4
    if (in5 in range1and2 || in5 in range3and4) {
        println(true)
    } else {
        println(false)
    }
}