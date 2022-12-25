package drawingBook
fun pageCount(n: Int, p: Int): Int {
    val countFromStart :Int = p/2
    val countFromEnd :Int = n/2 - p/2

    return minOf(countFromStart,countFromEnd)
}
fun main() {
    val n = readLine()!!.trim().toInt()

    val p = readLine()!!.trim().toInt()

    val result = pageCount(n, p)

    println(result)
}