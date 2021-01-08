/* -- File created by dev.mgck on 05 jan, 2021 at 20:44 -- */
package iniciante

fun main(args: Array<String>) {
    
    fun readlnInt() = readLine()!!.toInt()
    while (true) {
        var x = readlnInt()
        if (x == 0) break
    
        var sum = 0
        var n = x
        var k = 1
        
        while (k <= 5) {
            if (n % 2 == 0) {
                sum += n
                k++
            }
            n++
        }
        println(sum)
    }
}