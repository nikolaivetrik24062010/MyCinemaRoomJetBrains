fun findYears(depo: Double): Int{
    var deposit = depo
    val interestRate = 1.071
    val max = 700000
    var years = 0
    val input = readln()
    while (deposit < max)
        years++
    return years
}