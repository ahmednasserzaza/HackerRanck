package camelCase

fun camelcase(s: String): Int {
    return s.count{it.isUpperCase()} + 1
}

fun main() {
    val s = readLine()!!
    val result = camelcase(s)
    println(result)
}