/* -- File created by dev.mgck on 05 jan, 2021 at 17:22 -- */
package iniciante


fun main(args: Array<String>) {
    
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        if (n % i == 0) {
            println(i)
        }
    }
}