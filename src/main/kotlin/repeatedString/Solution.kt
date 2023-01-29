package repeatedString

fun repeatedString(s: String, n: Long): Long {
    val fullRepeats = n.div(s.length)
    val leftOver = (n % s.length).toInt()

    val perString = s.count { it == 'a' }
    val remainder = s.take(leftOver).count { it == 'a' }
    return fullRepeats.times(perString).plus(remainder)
}

fun main() {
    val s = readLine()!!

    val n = readLine()!!.trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}