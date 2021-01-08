package iniciante

import java.math.BigDecimal
import java.math.RoundingMode

fun main(args: Array<String>) {

  val valorA = readLine()!!.toDouble()
  val valorB = readLine()!!.toDouble()
  val valorC = readLine()!!.toDouble()
  val pesoA = 2
  val pesoB = 3
  val pesoC = 5
  val media = ((valorA * pesoA) + (valorB * pesoB) + (valorC * pesoC))  / (pesoA + pesoB + pesoC)
  val resultado = BigDecimal(media).setScale(1, RoundingMode.HALF_EVEN)
  println("MEDIA = $resultado")

}