/* -- File created by dev.mgck on 04 jan, 2021 at 18:56 -- */

package iniciante


fun main(args: Array<String>) {
    
    fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    
    for (i in 1..readLine()!!.toInt()) {
        val (x, y, z) = readLine()!!.split(" ").map { it.toDouble() }
        println((((x * 2) + (y * 3) + (z * 5)) / 10).format(1))
    }
}