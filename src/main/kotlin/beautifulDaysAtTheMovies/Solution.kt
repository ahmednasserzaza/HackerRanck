package beautifulDaysAtTheMovies

import kotlin.math.abs

fun beautifulDays(i: Int, j: Int, k: Int): Int {
    return IntRange(i, j).count { (it - it.toString().reversed().toInt()) % k == 0 }
}
/*
fun beautifulDays(i: Int, j: Int, k: Int): Int {
    var beautiful = 0
    for (days in i..j){
        if (abs(days - reverseNum(days)) %k == 0) beautiful++
    }
    return beautiful
}

fun reverseNum(num:Int):Int{
    var reversed = 0
    var num = num
    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }
    return reversed
}

 */
fun main() {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val i = first_multiple_input[0].toInt()

    val j = first_multiple_input[1].toInt()

    val k = first_multiple_input[2].toInt()

    val result = beautifulDays(i, j, k)

    println(result)
}