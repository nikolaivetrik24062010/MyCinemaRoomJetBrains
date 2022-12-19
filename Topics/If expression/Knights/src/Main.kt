import kotlin.math.abs

fun main() {
    val (x1, y1) = readln().split(" ").map { it.toInt() }
    val (x2, y2) = readln().split(" ").map { it.toInt() }

    if (
        abs(x1 - x2) == 2 && abs(y1 - y2) == 1 ||
        abs(y1 - y2) == 2 && abs(x1 - x2) == 1
    ) println("YES") else println("NO")
}