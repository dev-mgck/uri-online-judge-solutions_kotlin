/* -- File created by dev.mgck on 07 jan, 2021 at 00:21 -- */
package iniciante


fun main(args: Array<String>) {
    
    val P = IntArray(5).toMutableList()
    val I = IntArray(5).toMutableList()
    var c = 0
    while (c < 15) {
    
        val n = readLine()!!.toInt()
        
        if (n % 2 == 0) {
            P.add(n)
            if (P.size == 5 ) {
                for (i in 0.until(P.size)) {
                    println("par[$i] = ${P[i]}")
                    P.clear()
                }
            }
        } else {
            I.add(n)
            if (I.size == 5) {
                for (i in 0.until(I.size)) {
                    println("impar[$i] = ${I[i]}")
                    I.clear()
                }
            }
        }
        c++
    }
    for (a in 0.until(I.size)) { println("impar[$a] = ${I[a]}") }
    for (b in 0.until(I.size)) { println("par[$b] = ${I[b]}") }
}