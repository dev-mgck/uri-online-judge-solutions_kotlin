package iniciante

import java.math.BigDecimal
import java.math.RoundingMode

fun main(args: Array<String>) {

  val valorA = readLine()!!.toDouble()
  val valorB = readLine()!!.toDouble()
  val pesoA = 3.5
  val pesoB = 7.5
  val media = ((valorA * pesoA) + (valorB * pesoB)) / (pesoA + pesoB)
  val resultado = BigDecimal(media).setScale(5, RoundingMode.HALF_EVEN)
  println("MEDIA = $resultado")

}