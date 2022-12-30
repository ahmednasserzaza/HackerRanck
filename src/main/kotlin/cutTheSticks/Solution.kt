package cutTheSticks

fun cutTheSticks(arr: Array<Int>): Array<Int> {
    var(list, new_list) = arrayOf(mutableListOf<Int>(), mutableListOf<Int>())
    arr.forEach{list.add(it)}
    new_list.add(arr.size)
    for (i in 0..arr.max()) {
        list = list.filter{it != list.min()}.toMutableList()
        val count = list.count{it > 0}
        if (count != 0 && !new_list.contains(count)) {
            new_list.add(count)
        }
    }
    return new_list.toTypedArray()
}
fun main() {
    val n = readLine()!!.trim().toInt()
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val result = cutTheSticks(arr)
    println(result.joinToString("\n"))
}