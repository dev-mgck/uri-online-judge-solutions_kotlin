/* -- File created by dev.mgck on 06 jan, 2021 at 21:53 -- */
package iniciante


fun main(args: Array<String>) {
    
    val N = IntArray(1000).toMutableList()
    val T = readLine()!!.toInt()
    var c = 0
    while (c < 999) {
        for (i in 0..T-1) {
            if (c > 999) break
            N[c] = i
            c++
        }
    }
    for (k in 0.until(N.size)) println("N[$k] = ${N[k]}")
}