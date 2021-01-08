/* -- File created by dev.mgck on 04 jan, 2021 at 21:21 -- */
package iniciante

import java.text.DecimalFormat

fun main(args: Array<String>) {
    
    val df = DecimalFormat("0.0")
    var I = 0.0; var J = 1.0
    while (I <= 2) {
        for (k in 1..3) {
            if (df.format(I).endsWith("0")) {
                println("I=${df.format(I).substring(0, 1)} J=${df.format(J).substring(0,1)}")
            } else {
                println("I=${df.format(I).replace(',','.')} " +
                    "J=${df.format(J).replace(',','.')}")
            }
            J++
        }
        J -= 3
        J += 0.2
        I += 0.2
    }
}