/* -- File created by dev.mgck on 06 jan, 2021 at 20:12 -- */
package iniciante


fun main(args: Array<String>) {
    
    val N = IntArray(20) { readLine()!!.toInt() }
    var pos = 0
    for (i in (N.size - 1).downTo(0)) {
        println("N[$pos] = ${N[i]}")
        pos++
    }
}