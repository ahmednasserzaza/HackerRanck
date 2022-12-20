package catsAndAMouse

import java.util.*

fun catAndMouse(x: Int, y: Int, z: Int): String {
    val catA: Int = if (x > z) (x - z) else (z - x)
    val catB = if (y > z) (y - z) else (z - y)
    return if (catA < catB) "Cat A" else if (catB < catA) "Cat B" else "Mouse C"
}

fun main() {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}