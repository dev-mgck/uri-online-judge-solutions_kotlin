/* -- File created by dev.mgck on 05 jan, 2021 at 12:59 -- */
package iniciante


fun main(args: Array<String>) {
    
    var r = 1
    for (i in 1..readLine()!!.toInt()) {
        println("$r ${r * r} ${ r * r * r}")
        r += 1
    }
}