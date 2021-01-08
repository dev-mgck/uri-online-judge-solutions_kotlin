/* -- File created by dev.mgck on 02 jan, 2021 at 13:10 -- */
package iniciante

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow


fun main(args: Array<String>) {

  val pi =  3.14159
  val raio = readLine()!!.toDouble()
  val volume = ((4/3.0) * pi) * raio.pow(3)
  val resultado = BigDecimal(volume).setScale(3, RoundingMode.HALF_EVEN)
  println("VOLUME = $resultado")

}