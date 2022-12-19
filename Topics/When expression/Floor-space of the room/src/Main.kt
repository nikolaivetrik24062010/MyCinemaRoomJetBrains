fun main() = print(when (readLine()!!) {
    "rectangle" -> List(2) { readLine()!!.toDouble() }.let { it[0] * it[1] }
    "circle" -> 3.14 * Math.pow(readLine()!!.toDouble(), 2.0)
    "triangle" -> List(3) { readLine()!!.toDouble() }.let {
        val semiPer = (it[0] + it[1] + it[2]) / 2
        Math.sqrt(semiPer * (semiPer - it[0]) * (semiPer - it[1]) * (semiPer - it[2]))
    }
    else -> ""
})
