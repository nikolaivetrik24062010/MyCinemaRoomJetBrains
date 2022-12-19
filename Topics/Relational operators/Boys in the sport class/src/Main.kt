//fun main() {
//    val height1 = readln().toInt()
//    val height2 = readln().toInt()
//    val height3 = readln().toInt()
//    val ascending = height1 <= height2 && height2 <= height3
//    val descending = height3 <= height2 && height2 <= height1
//    if (ascending || descending) {
//        true
//        println("true")
//    } else println("false")
//}
fun main() {
    val (a, b, c) = Array(3) { readLine()!!.toInt() }
    print(b in a..c || b in c..a)
}
