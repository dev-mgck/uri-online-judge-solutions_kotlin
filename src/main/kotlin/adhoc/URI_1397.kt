/* -- File created by dev.mgck on 07 jan, 2021 at 16:47 -- */
package adhoc

fun main(args: Array<String>) {

    while (true) {
        
        var countA = 0; var countB = 0
        val N = readLine()!!.toInt()
        if (N == 0) break
        else {
            for (i in 1..N) {
                val (A, B) = readLine()!!.split(" ").map { it.toInt() }
                if (A > B) countA++
                else if (B > A) countB++
            }
            println("$countA $countB")
        }
    }
}