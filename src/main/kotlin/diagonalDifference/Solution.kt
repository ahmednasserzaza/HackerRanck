package diagonalDifference

import kotlin.math.abs

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var primaryDiagonal = 0
    var secondaryDiagonal = 0
    for (row in arr.indices) {
        primaryDiagonal += arr[row][row]
        secondaryDiagonal += arr[row][arr.size - 1 - row]
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