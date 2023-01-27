package jumpingOnTheClouds

import java.util.*

fun jumpingOnClouds(c: Array<Int>, k: Int): Int {
    var energy = 100
    val cloudsNumber = c.count()
    var count = 0
    do {
        energy--
        count += k
        if (count >= cloudsNumber)
            count -= cloudsNumber
        if (c[count] == 1)
            energy -= 2
    } while (count != 0)

    return energy
}


fun main() {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val c = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = jumpingOnClouds(c, k)

    println(result)
}