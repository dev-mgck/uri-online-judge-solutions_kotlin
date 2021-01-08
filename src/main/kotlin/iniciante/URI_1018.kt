/* -- File created by dev.mgck on 02 jan, 2021 at 14:52 -- */
package iniciante


fun main(args: Array<String>) {

  val valor = readLine()!!.toInt()
  val nCem = valor / 100
  val resCem = valor % 100
  val nCinquenta = resCem / 50
  val resCinquenta = resCem % 50
  val nVinte = resCinquenta / 20
  val resVinte = resCinquenta % 20
  val nDez = resVinte / 10
  val resDez = resVinte % 10
  val nCinco = resDez / 5
  val resCinco = resDez % 5
  val nDois = resCinco / 2
  val resDois = resCinco % 2
  val nUm = resDois / 1
  val resDUm = resDois % 1

  println(valor)
  println("$nCem nota(s) de R$ 100,00")
  println("$nCinquenta nota(s) de R$ 50,00")
  println("$nVinte nota(s) de R$ 20,00")
  println("$nDez nota(s) de R$ 10,00")
  println("$nCinco nota(s) de R$ 5,00")
  println("$nDois nota(s) de R$ 2,00")
  println("$nUm nota(s) de R$ 1,00")

}