package appleAndOrange
fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>) {
    var appleLand:Int
    var orangeLand:Int
    var applesNum = 0
    var orangeNum = 0
    for (apple in apples){
        appleLand = a + apple
        if (appleLand in s..t) applesNum++
    }
    for (orange in oranges){
        orangeLand = b + orange
        if (orangeLand in s..t) orangeNum++
    }
    print("$applesNum\n$orangeNum")

}
fun main() {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()

    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = third_multiple_input[0].toInt()

    val n = third_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val oranges = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}