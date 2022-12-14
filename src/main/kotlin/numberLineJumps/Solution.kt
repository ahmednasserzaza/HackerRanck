package numberLineJumps

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    var step1 = v1
    var step2 = v2
    var result:String =""
    for (i in x1..x2){
        if ((x1+step1) == (x2+step2)){
            result = "YES"
        }
        else{
            step1 += v1
            step2 += v2
            result = "NO"
        }
    }
    return result
}
fun main() {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val x1 = first_multiple_input[0].toInt()

    val v1 = first_multiple_input[1].toInt()

    val x2 = first_multiple_input[2].toInt()

    val v2 = first_multiple_input[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}