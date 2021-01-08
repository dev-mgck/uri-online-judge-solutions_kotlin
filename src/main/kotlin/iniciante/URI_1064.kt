/* -- File created by dev.mgck on 04 jan, 2021 at 16:56 -- */
package iniciante


fun main(args: Array<String>) {
    
    fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    
    val l = mutableListOf<Double>()
    for (i in 1..6) {
        val n = readLine()!!.toDouble()
        if (n > 0) {
            l.add(n)
        }
    }
    println("${l.size} valores positivos")
    println((l.sum() / l.size).format(1))
}