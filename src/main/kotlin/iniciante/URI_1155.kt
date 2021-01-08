/* -- File created by dev.mgck on 05 jan, 2021 at 17:00 -- */
package iniciante


fun main(args: Array<String>) {
    
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    
    var S = 0f
    for (i in 1..100) {
        S += (1f/i)
    }
    println(S.format(2))

}