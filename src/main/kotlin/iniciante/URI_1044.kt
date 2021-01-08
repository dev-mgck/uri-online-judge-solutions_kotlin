/* -- File created by dev.mgck on 04 jan, 2021 at 09:01 -- */
package iniciante


fun main(args: Array<String>) {
    
    val (a, b) = readLine()!!.split(" ").map { it.toDouble() }
    if (a >= b && a % b == 0.0 ) println("Sao Multiplos")
    else if (a < b && b % a == 0.0 ) println("Sao Multiplos")
    else {println("Nao sao Multiplos") }
    
}