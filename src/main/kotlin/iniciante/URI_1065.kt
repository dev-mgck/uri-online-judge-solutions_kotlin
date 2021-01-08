package iniciante


/* Pares entre Cinco Números
Faça um programa que leia 5 valores inteiros.
Conte quantos destes valores digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de
valores pares lidos.*/


fun main(args: Array<String>) {

  val inteiros = mutableListOf<Int>()
  val pares = mutableListOf<Int>()

  for (i in 1..5) { inteiros.add(readLine()!!.toInt()) }
  for (i in inteiros) { if (i % 2 == 0) { pares.add(i) } }
  println("${pares.size} valores pares")

}

