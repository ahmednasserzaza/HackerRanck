package stairCase
/*
Print this
     #
    ##
   ###
  ####
 #####
######
 */
fun staircase(n: Int): Unit {
    for (i in 1..n){
        for (j in 1..n){
          val data = if ((i+j) > n) '#' else ' '
            print(data)
        }
        println()
    }
}
fun main() {
    val n = readLine()!!.trim().toInt()
    staircase(n)
}