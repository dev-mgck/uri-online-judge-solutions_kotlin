/* -- File created by dev.mgck on 02 jan, 2021 at 13:18 -- */
package iniciante

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow

fun main(args: Array<String>) {

  val pi = 3.14159
  val input = readLine()!!
  val a = input.split(" ")[0].toDouble()
  val b = input.split(" ")[1].toDouble()
  val c = input.split(" ")[2].toDouble()
  val areaTri = (a * c) / 2
  val areCir = pi * c.pow(2)
  val areaTra = ((a + b) * c) / 2
  val areaQua = b * b
  val areaRet = a * b
  val resTri = BigDecimal(areaTri).setScale(3,RoundingMode.HALF_EVEN)
  val resCir = BigDecimal(areCir).setScale(3,RoundingMode.HALF_EVEN)
  val resTra = BigDecimal(areaTra).setScale(3,RoundingMode.HALF_EVEN)
  val resQua = BigDecimal(areaQua).setScale(3,RoundingMode.HALF_EVEN)
  val resRet = BigDecimal(areaRet).setScale(3,RoundingMode.HALF_EVEN)
  println("TRIANGULO: $resTri")
  println("CIRCULO: $resCir")
  println("TRAPEZIO: $resTra")
  println("QUADRADO: $resQua")
  println("RETANGULO: $resRet")

}