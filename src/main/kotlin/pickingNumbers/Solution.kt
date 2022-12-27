package pickingNumbers

fun pickingNumbers(a: Array<Int>): Int {
    var max = 0
    a.forEach {i->
        var c = 0
        c = a.count { it == i || it == i+1}
        if(c>max) max = c
    }
    return max
}

fun main() {
    val n = readLine()!!.trim().toInt()
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val result = pickingNumbers(a)
    println(result)
}