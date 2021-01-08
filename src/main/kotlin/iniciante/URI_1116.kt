/* -- File created by dev.mgck on 05 jan, 2021 at 12:40 -- */
package iniciante

import java.math.BigDecimal
import java.math.RoundingMode


fun main(args: Array<String>) {
    
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    
    for (i in 1..readLine()!!.toInt()) {
        val (X, Y) = readLine()!!.split(" ").map { it.toFloat() }
        if (Y == 0F) {
            println("divisao impossivel")
        } else {
            val d = X / Y
            println(d.format(1))
        }
    }
}