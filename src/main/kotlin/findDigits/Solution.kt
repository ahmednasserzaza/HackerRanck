package findDigits
fun findDigits(n: Int): Int {
    var result = 0
    n.toString().forEach {
        val digit = it - '0'
        if (digit > 0 && n % digit == 0) result++
    }
    return result
}
fun main() {
    val t = readLine()!!.trim().toInt()
    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()
        val result = findDigits(n)
        println(result)
    }
}