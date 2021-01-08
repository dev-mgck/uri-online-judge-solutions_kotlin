/* -- File created by dev.mgck on 05 jan, 2021 at 16:51 -- */
package iniciante


fun main(args: Array<String>) {
    
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    
    var sum = 0f
    var count = 0f
    var I : Float
    while (true) {
        I = readLine()!!.toFloat()
        if (I < 0f ) break
        sum += I
        count++
    }
    val m = sum / count
    println(m.format(2))

}