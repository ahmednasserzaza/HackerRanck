package billDivision

fun bonAppetit(bill: Array<Int>, k: Int, b: Int) {
    var shared = 0
    for (i in bill.indices) {
        if (i == k) continue
        shared += bill[i]
    }
    val bActual = shared / 2
    val result = b - bActual
    if (result == 0){
        println("Bon Appetit")
    }
    else println(result)
}

fun main() {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}