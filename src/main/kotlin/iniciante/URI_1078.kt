package iniciante

/*Tabuada
Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:
1 x N = N      2 x N = 2N        ...       10 x N = 10N

Entrada
A entrada contém um valor inteiro N (2 < N < 1000).
*/

fun main(args: Array<String>) {
  
  val n = readLine()!!.toInt()
  for (i in 1..10) { println("$i x $n = ${i * n}") }
  
}

