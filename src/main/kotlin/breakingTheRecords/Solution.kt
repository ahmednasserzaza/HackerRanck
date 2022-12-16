package breakingTheRecords

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var highest = 0
    var lowest = 0
    var totalHighest = 0
    var totalLowest = 0

    for (x in scores.indices){
        val it = scores[x]
        if (x != 0){
            if (it > highest){
                highest = it
                totalHighest++
            }
            else if (it < lowest){
                lowest = it
                totalLowest++
            }
        }
        else{
            highest = it
            lowest = it
        }
    }
    return arrayOf(totalHighest , totalLowest)
}

fun main() {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}