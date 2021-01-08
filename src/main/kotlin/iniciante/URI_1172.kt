/* -- File created by dev.mgck on 06 jan, 2021 at 18:58 -- */
package iniciante


fun main(args: Array<String>) {
    
    val list = IntArray(10) { readLine()!!.toInt() }
    for (x in 0.until(list.size)) { if (list[x] <= 0) list[x] = 1 }
    for (i in 0.until(list.size)) println("X[$i] = ${list[i]}")
    
}