/* -- File created by dev.mgck on 02 jan, 2021 at 18:27 -- */
package iniciante


fun main(args: Array<String>) {

  val input = readLine()!!.toDouble()
  when (input) {
    in 0.0000..25.0000 -> println("Intervalo [0,25]")
    in 25.0001..50.0000 -> println("Intervalo (25,50]")
    in 50.0001..75.0000 -> println("Intervalo (50,75]")
    in 75.0001..100.0000 -> println("Intervalo (75,100]")
    else -> println("Fora de intervalo")
  }
}