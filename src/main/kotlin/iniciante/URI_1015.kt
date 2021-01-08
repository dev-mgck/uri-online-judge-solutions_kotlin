/* -- File created by dev.mgck on 02 jan, 2021 at 14:10 -- */
package iniciante

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {

  val input1 = readLine()!!
  val x1 = input1.split(" ")[0].toDouble()
  val y1 = input1.split(" ")[1].toDouble()
  val input2 = readLine()!!
  val x2 = input2.split(" ")[0].toDouble()
  val y2 = input2.split(" ")[1].toDouble()
  val dist = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2) )
  val resultado = BigDecimal(dist).setScale(4,RoundingMode.HALF_EVEN)
  println(resultado)

}