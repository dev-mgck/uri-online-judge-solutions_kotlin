/* -- File created by dev.mgck on 04 jan, 2021 at 10:16 -- */
package iniciante


fun main(args: Array<String>) {
    
    fun Double.format(digits: Int) = "%.${digits}f".format(this)
    
    var res = 0.0
    val (h1, h2) = readLine()!!.split(" ").map { it.toDouble() }
    if (h1 > h2) res = (24.0 - h1) + h2
    if (h2 > h1) res = h2 - h1
    if (h1 == h2) res = 24.0
    println("O JOGO DUROU ${res.format(0)} HORA(S)")
    
}