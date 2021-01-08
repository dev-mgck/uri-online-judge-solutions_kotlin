/* -- File created by dev.mgck on 04 jan, 2021 at 08:23 -- */
package iniciante


fun main(args: Array<String>) {
    
    fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    
    val (a, b, c) = readLine()!!.split(" ").map { it.toDouble() }
    val p = (a + b + c).format(1)
    val r = ( ( (a + b) * c  / 2 ) ).format(1)
    if ( a < (b + c) && b < (a + c) && c < (b + a) ) println("Perimetro = $p")
    else println("Area = $r")
    
}

