package salesByMatch
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var result  = 0
    ar.groupingBy { it }.eachCount().map { result += (it.value / 2) }
    return result
}
fun main() {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}