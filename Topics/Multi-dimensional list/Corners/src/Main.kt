fun main() {
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    println("${inputList[0][0]} ${inputList[0][n - 1]}")
    println("${inputList[n - 1][0]} ${inputList[n - 1][n - 1]}")
}