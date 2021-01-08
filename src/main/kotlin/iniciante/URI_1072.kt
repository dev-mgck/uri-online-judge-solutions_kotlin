/* -- File created by dev.mgck on 04 jan, 2021 at 18:30 -- */
package iniciante


fun main(args: Array<String>) {
    
    var countI = 0; var countO = 0
    for (i in 1..readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        if (n in 10..20) countI++
        else countO++
    }
    println("$countI in\n$countO out")
}