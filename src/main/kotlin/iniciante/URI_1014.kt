/* -- File created by dev.mgck on 02 jan, 2021 at 14:06 -- */
package iniciante

import java.math.BigDecimal
import java.math.RoundingMode


fun main(args: Array<String>) {

  val dist = readLine()!!.toInt()
  val cons = readLine()!!.toDouble()
  val mediaCons = dist / cons
  val resultado = BigDecimal(mediaCons).setScale(3, RoundingMode.HALF_EVEN)
  println("$resultado km/l")

}