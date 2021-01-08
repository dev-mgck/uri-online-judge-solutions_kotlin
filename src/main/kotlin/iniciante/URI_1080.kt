/* -- File created by dev.mgck on 04 jan, 2021 at 19:18 -- */
package iniciante


fun main(args: Array<String>) {
    
    var n : Int
    var m = 0; var p = 0
    for (i in 1..100) {
        val n = readLine()!!.toInt()
        if (m > n) {
            m = m
            p = p
        } else {
            p = i
            m = n
        }
    }
    println("$m\n$p")

}