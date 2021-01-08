/* -- File created by dev.mgck on 05 jan, 2021 at 17:07 -- */
package iniciante


fun main(args: Array<String>) {
    
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    var s = 0f
    var n = 1f
    for (i in 1.rangeTo(40).step(2)) {
        val m = i / n
        s += m
        n *= 2
        
    }
    println(s.format(2))
}