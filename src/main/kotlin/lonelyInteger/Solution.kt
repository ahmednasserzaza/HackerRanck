package lonelyInteger

fun lonelyInteger(a: Array<Int>): Int  = a.filter { item -> a.count { it == item } == 1 }[0]

fun main() {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = lonelyInteger(a)

    println(result)
}