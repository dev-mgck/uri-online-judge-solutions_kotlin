/* -- File created by dev.mgck on 02 jan, 2021 at 14:00 -- */
package iniciante


fun main(args: Array<String>) {

  val input = readLine()!!
  val a = input.split(" ")[0].toInt()
  val b = input.split(" ")[1].toInt()
  val c = input.split(" ")[2].toInt()
  val maior = maxOf(a, b ,c)
  println("$maior eh o maior")

}