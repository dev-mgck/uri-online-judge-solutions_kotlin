/* -- File created by dev.mgck on 02 jan, 2021 at 17:48 -- */
package iniciante

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {

  val input = readLine()!!
  val a = input.split(" ")[0].toDouble()
  val b = input.split(" ")[1].toDouble()
  val c = input.split(" ")[2].toDouble()

  val delta = b.pow(2) - (4 * a * c)

  try {
    val r1 = (-(b) + sqrt(delta)) / (2 * a)
    val r2 = (-(b) - sqrt(delta)) / (2 * a)
    val resR1 = BigDecimal(r1).setScale(5,RoundingMode.HALF_EVEN)
    val resR2 = BigDecimal(r2).setScale(5,RoundingMode.HALF_EVEN)
    println("R1 = $resR1")
    println("R2 = $resR2")
  } catch (e : Exception) {
    println("Impossivel calcular")
  }
}