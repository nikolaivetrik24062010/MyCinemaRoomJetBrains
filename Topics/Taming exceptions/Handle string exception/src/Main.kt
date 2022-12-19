fun main() {
    val index = readLine()!!.toInt()
    val word = readLine()!!

    println(
        word.getOrNull(index) ?: "There isn't such an element in the given string, please fix the index!"
    )
}