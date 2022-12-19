package theHardleRace
fun hurdleRace(k: Int, height: Array<Int>): Int {
    var result = 0
    var max =0
    for (i in height) if (i >= max) max = i
    if (k < max) result = max - k
    return result
}

fun main() {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val height = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = hurdleRace(k, height)

    println(result)
}