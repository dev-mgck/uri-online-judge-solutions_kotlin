/* -- File created by dev.mgck on 07 jan, 2021 at 16:04 -- */
package adhoc

fun main(args: Array<String>) {
    
    val N = readLine()!!.toInt()
    for (i in 1..N) {
    
        val A = readLine()!!.map { it }
        val N1 = A[0].toString().toInt()
        val N2 = A[2].toString().toInt()
        if (N1 == N2) println(N1 * N2)
        else if (A[1].isUpperCase()) println(N2 - N1)
        else println(N1 + N2)
        
    }
}