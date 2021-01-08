/* -- File created by dev.mgck on 04 jan, 2021 at 10:59 -- */
package iniciante


fun main(args: Array<String>) {
    
    fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    
    val s = readLine()!!.toDouble()
    var r = 0.0
    
    
    when (s) {
        in 0.00..400.00 -> r = 0.15
        in 400.01..800.00 -> r = 0.12
        in 800.01..1200.00 -> r = 0.10
        in 1200.01..2000.00 -> r = 0.07
        else -> r = 0.04
    }
    
    val n = s * (1 + r)
    val d = n - s
    
    println("Novo salario: ${n.format(2)}")
    println("Reajuste ganho: ${d.format(2)}")
    println("Em percentual: ${(r * 100).format(0)} %")
    
}