fun main() {
    val x = readln().toInt() > 0
    val y = readln().toInt() > 0
    val z = readln().toInt() > 0

    println(x xor y xor z && !(x && y && z))
}
