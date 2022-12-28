package viralAdvertising

fun viralAdvertising(n: Int): Int {
    var shared = 5
    var liked:Int
    var cumulative = 0

    for (people in 1..n){
        liked = shared / 2
        shared = liked * 3

        cumulative += liked
    }
    return cumulative
}
fun main() {
        val n = readLine()!!.trim().toInt()
        val result = viralAdvertising(n)
        println(result)
}