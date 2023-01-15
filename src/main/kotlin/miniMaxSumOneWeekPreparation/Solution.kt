package miniMaxSumOneWeekPreparation

fun miniMaxSum(arr: Array<Int>) {

    var min = Int.MAX_VALUE;
    var max = 1;
    var sum = 0L;

    for (i in arr) {
        min = minOf(min, i);
        max = maxOf(max, i);
        sum += i;
    }
    println("${sum - max} ${sum - min}")

}

fun main() {

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}