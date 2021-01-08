/* -- File created by dev.mgck on 02 jan, 2021 at 11:49 -- */
package iniciante

import java.math.BigDecimal
import java.math.RoundingMode

fun main(args: Array<String>) {

  val input1 = readLine()!!
  val qtd1 = input1.split(" ")[1].toInt()
  val v1 = input1.split(" ")[2].toDouble()
  val input2 = readLine()!!
  val qtd2 = input2.split(" ")[1].toInt()
  val v2 = input2.split(" ")[2].toDouble()
  val valorTotal = (qtd1 * v1) + (qtd2 *v2)
  val resultado = BigDecimal(valorTotal).setScale(2,RoundingMode.HALF_EVEN)
  println("VALOR A PAGAR: R$ $resultado")

}




