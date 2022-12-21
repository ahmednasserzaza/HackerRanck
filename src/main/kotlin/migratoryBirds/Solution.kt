package migratoryBirds

fun migratoryBirds(arr: Array<Int>): Int {
    // Good Solution using functional programming
    return arr.groupingBy { it }.eachCount().toSortedMap().maxBy { it.value }.key ?: 0

    // bad solution (Time error Complexity)
    /*
    var currentId = 0
    var max = 0
    var lastId = 0
    for (n in 1..arr.size) {
        for (id in arr) {
            if (n == id) {
                currentId++
                if (currentId > lastId ) max = id
            }
        }
        lastId = currentId
        currentId = 0
    }
    return max
     */
}
// Another bad solution (Time Error Complexity)
/*
fun migratoryBirds2(arr: Array<Int>): Int {
    var currentId = 0
    var max = 0
    var lastId = 0
    for (n in 1..arr.size){
        arr.forEach {
            if (n == it) {
                currentId++
                if (currentId > lastId) max = it
            }
        }
        lastId = currentId
        currentId = 0
    }
    return max
}
 */

    fun main() {
        val arrCount = readLine()!!.trim().toInt()

        val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

        val result = migratoryBirds(arr)

        println(result)
    }