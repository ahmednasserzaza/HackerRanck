package gradingStudents

fun gradingStudents(grades: Array<Int>): ArrayList<Int> {
    var round:Int
    var difference:Int
    var finalGrade:Int
    val result =ArrayList<Int>()

    for (x in grades){
        if (x >= 38){
            round = x
            while ( (round % 5) != 0 ) {
                round ++
            }
            difference = round - x
            finalGrade = if (difference <3) round else x
        }
        else{
            finalGrade = x
        }
        result.add(finalGrade)
    }
    return result
}
fun main() {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}