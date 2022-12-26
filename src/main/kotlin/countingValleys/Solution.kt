package countingValleys

fun countingValleys(steps: Int, path: String): Int {
    var valleys = 0
    var height = 0
    for (steps in path) {
        if (steps == 'U') height++ else height--
        if (height == 0 && steps == 'U') valleys++
    }
    return valleys
}

fun main() {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}