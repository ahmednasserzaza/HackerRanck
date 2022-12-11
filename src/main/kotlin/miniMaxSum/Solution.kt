package miniMaxSum

import kotlin.math.min

fun miniMaxSum(arr: Array<Int>): Unit {
    var min:Long = arr[0].toLong()
    var max:Long = 0
    var total:Long = 0
    for (x in arr.indices) {
        val item = arr[x].toLong()
        total += item
        if (item < min) {
            min = item
        }
        if (item > max) {
            max = item
        }
    }
    println("${total - max} ${total - min}")
}

fun main() {
    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}