package compareTriplets/*
 * Complete the 'compareTriplets.compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var alicePoints = 0
    var bobPoints = 0
    for (i in a.indices){
        val itAlice = a[i]
        val itBob = b[i]
        if (itAlice > itBob) alicePoints++
        else if (itAlice < itBob) bobPoints++
    }
    return arrayOf(alicePoints , bobPoints)
}

fun main() {
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}