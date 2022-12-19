fun main() {    
    val m = readln().toInt()
    val mm = readln().toInt()
    val h = readln().toInt()
    print(if (h > mm) "Excess" else if (h < m) "Deficiency" else "Normal")
}