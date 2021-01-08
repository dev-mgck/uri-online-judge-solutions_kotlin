/* -- File created by dev.mgck on 02 jan, 2021 at 19:17 -- */
package iniciante

import java.math.BigDecimal
import java.math.RoundingMode

fun main(args: Array<String>) {

  val input = readLine()!!
  val p = input.split(" ")[0].toInt()
  val q = input.split(" ")[1].toInt()

  var p1 = 0.00

  when (p) {
    1 -> p1 = 4.00
    2 -> p1 = 4.50
    3 -> p1 = 5.00
    4 -> p1 = 2.00
    5 -> p1 = 1.50
  }

  val total = p1 * q
  val resultado = BigDecimal(total).setScale(2,RoundingMode.HALF_EVEN)
  println("Total: R$ $resultado")

}


