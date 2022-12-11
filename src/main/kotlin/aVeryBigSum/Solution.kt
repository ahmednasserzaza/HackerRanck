package aVeryBigSum
fun aVeryBigSum(ar: Array<Long>): Long {
    var result:Long = 0
    for (i in ar){
        result += i
    }
    return result

}
fun main() {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}