@SuppressWarnings("MagicNumber")
fun main() {
    val category = readln().toInt()
    when {
        category < 1 -> println("no army")
        category <= 4 -> println("few")
        category <= 9 -> println("several")
        category <= 19 -> println("pack")
        category <= 49 -> println("lots")
        category <= 99 -> println("horde")
        category <= 249 -> println("throng")
        category <= 499 -> println("swarm")
        category <= 999 -> println("zounds")
        category >= 1000 -> println("legion")
    }
}
