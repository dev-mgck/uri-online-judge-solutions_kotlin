/* -- File created by dev.mgck on 02 jan, 2021 at 16:04 -- */
package iniciante


fun main(args: Array<String>) {

  val ano = 365; val mes = 30
  val dias = readLine()!!.toInt()

  val nAnos = dias / ano // 1
  val resAnos = dias % ano // 35
  val nMeses = resAnos / mes // 1
  val resMeses = resAnos % mes // 5

  println("$nAnos ano(s)")
  println("$nMeses mes(es)")
  println("$resMeses dia(s)")

}