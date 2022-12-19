fun main() {
    val time = readln().toInt()
    val workTime = 9..18
    val lunchTime = 13..14
    println(time in workTime && time !in lunchTime)
}