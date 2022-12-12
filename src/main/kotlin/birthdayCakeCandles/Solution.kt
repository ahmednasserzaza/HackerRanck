package birthdayCakeCandles

fun birthdayCakeCandles(candles: Array<Int>): Int {
    val max = candles.max()
    var totalMax = 0
    for (num in candles){
        if (num == max) totalMax += 1
    }
    return totalMax
}
fun main() {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}