package timeConversion


fun timeConversion(s: String): String {
    val getZone = s.substring(8, 10)
    val getTime = s.substring(0, 8)
    val getHours = s.substring(0, 2)
    val getMinutesAndSeconds = s.substring(2, 8)
    var result: String = ""

    when (getZone) {
        "AM" -> result = if (getHours == "12") "00$getMinutesAndSeconds" else getTime
        "PM" ->
        {
            val sum = getHours.toInt() + 12
            result = if (getHours == "12") getTime else "$sum$getMinutesAndSeconds"
        }
    }
    return result

    // Another way
    /*
    if (getZone == "AM"){
        result = if (getHours == "12") "00$getMinutesAndSeconds" else getTime
    }
    else{
        val sum = getHours.toInt() + 12
        result = if (getHours == "12") getTime else "$sum$getMinutesAndSeconds"
    }
    return result
     */
}

fun main() {
    val s = readLine()!!
    val result = timeConversion(s)
    println(result)
}