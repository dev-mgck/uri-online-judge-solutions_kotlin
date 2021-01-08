package iniciante

import java.math.BigDecimal
import java.math.RoundingMode

fun main(args: Array<String>) {

  val name = readLine()
  val fixSalary = readLine()!!.toDouble()
  val totalSales = readLine()!!.toDouble()
  val result = fixSalary + (totalSales * 0.15)
  val final = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
  println("TOTAL = R$ $final")

}