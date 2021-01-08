/* -- File created by dev.mgck on 04 jan, 2021 at 08:00 -- */
package iniciante


fun main(args: Array<String>) {
    
    val lista = mutableListOf<Int>()
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    lista.addAll(listOf(a, b, c))
    lista.sort()
    println(lista.joinToString("\n"))
    println("\n$a\n$b\n$c")
    
}