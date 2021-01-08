/* -- File created by dev.mgck on 04 jan, 2021 at 18:46 -- */
package iniciante

fun main(args: Array<String>) {
    
    val n = readLine()!!.toInt()
    for (i in 1..10000) {
        if ( i % n == 2) {
            println(i)
        }
    }
}
