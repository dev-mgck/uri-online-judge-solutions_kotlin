/* -- File created by dev.mgck on 02 jan, 2021 at 21:06 -- */
package iniciante


fun main(args: Array<String>) {

  val lista =  mutableListOf<Int>()
  val n1 = readLine()!!.toInt()
  val n2 = readLine()!!.toInt()

  if (n1 > n2) {
    for (i in n2..n1) {
      if (i % 13 != 0) {
        lista.add(i)
      }
    }
  }

  if (n1 < n2) {
    for (i in n1..n2) {
      if (i % 13 != 0) {
        lista.add(i)
      }
    }
  }

  println(lista.sum())

}