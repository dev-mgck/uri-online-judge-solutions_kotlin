/* -- File created by dev.mgck on 02 jan, 2021 at 14:35 -- */
package iniciante

import java.math.BigDecimal
import java.math.RoundingMode

fun main(args: Array<String>) {

  val t = readLine()!!.toDouble()
  val v = readLine()!!.toDouble()
  val litros =  ((t * v) / 12)
  val resulado = BigDecimal(litros).setScale(3,RoundingMode.HALF_EVEN)
  println(resulado)

}