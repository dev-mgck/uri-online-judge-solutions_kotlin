package iniciante

import java.math.BigDecimal
import java.math.RoundingMode

fun main(args: Array<String>) {

  val number = readLine()!!.toInt()
  val hours = readLine()!!.toInt()
  val payment = readLine()!!.toDouble()
  val result = BigDecimal(hours * payment).setScale(2, RoundingMode.HALF_EVEN)
  println("NUMBER = $number")
  println("SALARY = U$ $result")

}


