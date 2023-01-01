package formingAMagicSquare

import kotlin.math.absoluteValue

typealias Matrix = Array<Array<Int>>
fun formingMagicSquare(s: Matrix): Int {
// There are only 8 well known magic squares,
// don't brute force it.
    val ms = listOf(arrayOf(
        arrayOf(8,1,6), arrayOf(3,5,7), arrayOf(4,9,2)),
        arrayOf(arrayOf(6,1,8), arrayOf(7,5,3), arrayOf(2,9,4)),
        arrayOf(arrayOf(4,9,2), arrayOf(3,5,7), arrayOf(8,1,6)),
        arrayOf(arrayOf(2,9,4), arrayOf(7,5,3), arrayOf(6,1,8)),
        arrayOf(arrayOf(8,3,4), arrayOf(1,5,9), arrayOf(6,7,2)),
        arrayOf(arrayOf(4,3,8), arrayOf(9,5,1), arrayOf(2,7,6)),
        arrayOf(arrayOf(6,7,2), arrayOf(1,5,9), arrayOf(8,3,4)),
        arrayOf(arrayOf(2,7,6), arrayOf(9,5,1), arrayOf(4,3,8)))

// Calculate all differences, return the minimum of them,
// never null.
    return ms.minOf {
        var cnt = 0
        (0..2).forEach { i ->
            (0..2).forEach { k ->
                cnt += (it[i][k] - s[i][k]).absoluteValue
            }
        }

        cnt
    }
}
fun main() {

    val s = Array<Array<Int>>(3, { Array<Int>(3, { 0 }) })

    for (i in 0 until 3) {
        s[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = formingMagicSquare(s)

    println(result)
}