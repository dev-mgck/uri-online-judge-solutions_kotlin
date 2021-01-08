/* -- File created by dev.mgck on 03 jan, 2021 at 15:33 -- */
package matematica

fun main(args: Array<String>) {
    
    val lista = mutableListOf<Int>()
    
    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        val (n1, n2) = input
        lista.add(mdc(n1, n2))
    }
    println(lista.joinToString("\n"))
}

// máximo divisor comum (chamada recursiva)
fun mdc(n1: Int, n2: Int): Int {
    return if (n2 != 0) mdc(n2, n1 % n2) else n1
}

