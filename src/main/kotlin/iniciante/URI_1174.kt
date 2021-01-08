/* -- File created by dev.mgck on 06 jan, 2021 at 19:55 -- */
package iniciante


fun main(args: Array<String>) {
    
    val A = FloatArray(100) { readLine()!!.toFloat() }
    for (i in 0.until(A.size)) {
        if (A[i] <= 10) {
            println("A[$i] = ${A[i]}")
        }
    }
}