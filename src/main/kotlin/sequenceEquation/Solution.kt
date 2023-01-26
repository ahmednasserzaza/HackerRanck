package sequenceEquation

fun permutationEquation(p: Array<Int>): Array<Int> {
    val results: MutableList<Int> = mutableListOf()
    val list = p.toList()
    for(x in 1..p.size) {
        val p1 = list.indexOf(x) + 1
        val p2 = list.indexOf(p1) + 1
        results.add(p2)
    }
    return results.toTypedArray()
}

fun main() {
    val n = readLine()!!.trim().toInt()

    val p = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = permutationEquation(p)

    println(result.joinToString("\n"))
}