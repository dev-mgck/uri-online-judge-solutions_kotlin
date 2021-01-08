/* -- File created by dev.mgck on 04 jan, 2021 at 21:52 -- */
package iniciante


fun main(args: Array<String>) {
    
    var x = 0; var y = 0
    var soma : Int
    
    for (i in 1..readLine()!!.toInt()) {
        soma = 0
        x = readLine()!!.toInt()
        y = readLine()!!.toInt()
        
        if (x%2 != 0 && x>y) x--
        if (y%2 != 0 && x<y) y--
        if (x%2 != 0 && x<y) x++
        if (y%2 != 0 && x>y) y++
        
    }
    
}