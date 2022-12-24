package utopianTree

fun utopianTree(n: Int): Int {
//    var height = 2 shl (n+1)/2
//    return if(n % 2 == 0) height - 1 else height - 2

//    var length = 1
//
//    for (period in 1..n) {
//        if (period.rem(2) != 0) length *= 2 else length++
//    }
//
//    return length

    var treeGrowth = 1
    for (i in 0 until n) {
        if (i % 2 == 0) {
            treeGrowth *= 2
        } else {
            treeGrowth += 1
        }
    }
    return treeGrowth
}

fun main() {
    val t = readLine()!!.trim().toInt()
    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()
        val result = utopianTree(n)
        println(result)
    }
}