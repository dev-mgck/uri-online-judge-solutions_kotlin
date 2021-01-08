/* -- File created by dev.mgck on 04 jan, 2021 at 16:09 -- */
package iniciante


fun main(args: Array<String>) {
    
    var count = 0
    for (i in 1..6) {
        val n = readLine()!!.toDouble()
        if (n > 0) {
            count++
        }
    }
    println("$count valores positivos")
    
}