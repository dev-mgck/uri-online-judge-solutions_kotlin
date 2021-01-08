/* -- File created by dev.mgck on 05 jan, 2021 at 13:42 -- */
package iniciante


fun main(args: Array<String>) {
    
    val (X , Y) = readLine()!!.split(" ").map { it.toInt() }
    for (i in 1..Y) {
       print(i)
       if (i % X == 0) println("")
       else print(" ")
    }

}