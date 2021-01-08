/* -- File created by dev.mgck on 02 jan, 2021 at 19:46 -- */
package iniciante


fun main(args: Array<String>) {

  val input = readLine()!!.toInt()
  if (input > 2) {
    for (i in 2.rangeTo(input).step(2)) {
      println("$i^2 = ${i * i}")
    }
  } else {
    println("2^2 = 4")
  }

}