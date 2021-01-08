/* -- File created by dev.mgck on 04 jan, 2021 at 20:18 -- */
package iniciante


fun main(args: Array<String>) {
    
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    
    var C = 0F; var R = 0F; var S = 0F
    for (i in 1..readLine()!!.toInt()) {
        val (q, c) = readLine()!!.split(" ").map { it }
        when (c) {
            "C" -> C += q.toFloat()
            "R" -> R += q.toFloat()
            "S" -> S += q.toFloat()
        }
    }
    val t = C + R + S
    println("Total: ${t.format(0)} cobaias")
    println("Total de coelhos: ${C.format(0)}")
    println("Total de ratos: ${R.format(0)}")
    println("Total de sapos: ${S.format(0)}")
    println("Percentual de coelhos: ${((C / t) * 100).format(2)} %")
    println("Percentual de ratos: ${((R / t) * 100).format(2)} %")
    println("Percentual de sapos: ${((S / t) * 100).format(2)} %")
}