package subArrayDivision

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var count = 0
    for (i in s.indices) {
        var date = 0
        for (j in 0 until m) {
            if ((i + j) >= s.size) break
            else date += s[i + j]
        }
        if (date == d) count++

    }
    return count
}

fun main() {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val d = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}