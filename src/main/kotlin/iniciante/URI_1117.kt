/* -- File created by dev.mgck on 02 jan, 2021 at 20:47 -- */
package iniciante


fun main(args: Array<String>) {

  val listaNotas = mutableListOf<Double>()

  while (listaNotas.size < 2) {
    val nota = readLine()!!.toDouble()
    if (nota in 0.0..10.0) listaNotas.add(nota) else println("nota invalida")
  }

  println("media = ${(listaNotas.sum() / listaNotas.size)}")

}