package diagonalDifference

import kotlin.math.abs
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var primaryDiagonal = 0
    var secondaryDiagonal = 0
    for (x in arr.indices) {
        primaryDiagonal += arr[x][x]
        secondaryDiagonal += arr[x][arr.size - 1 - x]
    }
    return abs(primaryDiagonal - secondaryDiagonal)
}

fun main() {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}