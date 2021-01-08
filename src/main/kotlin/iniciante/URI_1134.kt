/* -- File created by dev.mgck on 02 jan, 2021 at 22:16 -- */
package iniciante

fun main(args: Array<String>) {

  var a = 0; var g = 0; var d = 0
  var input = 0

  while (input != 4) {
    input = readLine()!!.toInt()
    when (input) {
      1 -> a++
      2 -> g++
      3 -> d++
    }
  }

  println("MUITO OBRIGADO")
  println("Alcool: $a")
  println("Gasolina: $g")
  println("Diesel: $d")

}