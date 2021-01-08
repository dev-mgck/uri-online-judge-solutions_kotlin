/* -- File created by dev.mgck on 06 jan, 2021 at 23:29 -- */
package iniciante


fun main(args: Array<String>) {
    
    val X = readLine()!!.toDouble()
    val N = DoubleArray(100).toMutableList()
    N[0] = X
    println("N[0] = ${X.format(4)}")
    for (i in 1.until(N.size)) {
        N[i] = N[i-1]/2.000
        println("N[$i] = ${N[i].format(4)}")
    }
}

private fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')