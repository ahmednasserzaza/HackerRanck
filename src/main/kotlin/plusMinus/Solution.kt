package plusMinus

fun plusMinus(arr: Array<Int>): Unit {
    var positiveNumbers = 0.0
    var negativeNumbers = 0.0
    var zeros = 0.0
    for (num in arr){
        if (num > 0) positiveNumbers ++
        else if (num < 0) negativeNumbers++
        else zeros++
    }
    println("%.6f".format(positiveNumbers / arr.count()))
    println("%.6f".format(negativeNumbers / arr.count()))
    println("%.6f".format(zeros / arr.count().toDouble()))
}

fun main() {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    plusMinus(arr)
}