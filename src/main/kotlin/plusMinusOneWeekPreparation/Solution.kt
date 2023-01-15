package plusMinusOneWeekPreparation

fun plusMinus(arr: Array<Int>){
    var positive = 0F
    var negative = 0F
    var zeros = 0F
    for (i in arr) {
        if (i > 0) positive++
        else if (i < 0) negative++
        else zeros++
    }
    println("%.6f".format(positive / arr.size))
    println("%.6f".format(negative / arr.size))
    println("%.6f".format(zeros / arr.size))
}

fun main() {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    plusMinus(arr)
}