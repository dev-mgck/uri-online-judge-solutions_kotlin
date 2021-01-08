/* -- File created by dev.mgck on 07 jan, 2021 at 21:01 -- */
package iniciante


    
fun main(args: Array<String>) {
    
    var sum = 0.0
    val T = readLine()!!.toUpperCase()
    val M = Array(12) { DoubleArray(12) }
    
    for (i in 0.until(M.size)) {
        for (j in 0.until(M[i].size)) {
            M[i][j] = readLine()!!.toDouble()
        }
    }
    
    for (k in 0.until(M.size)) {
        for (l in 0.until(M[k].size)) {
            if (l > k) sum += M[k][l]
        }
    }
    
    if (T == "M") sum /= ((M.size * M.size) -12) / 2
    println(sum.format(1))
}

private fun Double.format(digits: Int) = "%.${digits}f"
        .format(this).replace(',','.')
