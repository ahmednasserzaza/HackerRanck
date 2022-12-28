package angryProfessor

fun angryProfessor(k: Int, a: Array<Int>): String {
    var arrived = 0
    a.forEach {
        if (it <= 0) arrived++
    }
    return if (arrived >= k) "NO"
    else "YES"
}

fun main() {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val n = first_multiple_input[0].toInt()

        val k = first_multiple_input[1].toInt()

        val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        val result = angryProfessor(k, a)

        println(result)
    }
}