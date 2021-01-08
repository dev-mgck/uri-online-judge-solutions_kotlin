/* -- File created by dev.mgck on 04 jan, 2021 at 13:32 -- */
package iniciante

fun main(args: Array<String>) {
    
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toFloat()
    var i = 0F
    
    if (r <= 2000) {
        i = 0F
    } else if (r > 2000 && r <= 3000) {
        i = (r - 2000F) * 0.08F
    } else if (r >3000 && r <= 4500) {
        i = (r - 3000F) * 0.18F + (1000F * 0.08F)
    } else if (r > 4500) {
        i = (r - 4500F) * 0.28F + (1500F * 0.18F) + (1000F *0.08F)
    }
    if (i == 0F) println("Isento") else println("R$ ${i.format(2)}")
    
    
}