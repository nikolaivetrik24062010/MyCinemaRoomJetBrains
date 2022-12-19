fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val resultTrue = true
    val resultFalse = false

    if (a in b..c || a in c..b) {
        println(resultTrue)
    } else println(resultFalse)
}