/* -- File created by dev.mgck on 03 jan, 2021 at 22:40 -- */
package adhoc

import kotlin.math.abs

fun main(args: Array<String>) {
    
    var input : List<Int>
    var min : Int
    
    while (true) {
        
        input = readLine()!!.split(" ").map { it.toInt() }
        val (h1, m1, h2, m2 ) = input
        
        if (h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0) { break }
        else {
            val x = h1*60 + m1
            var y = h2*60 + m2
            
            if (y <= x) { y += 24*60 }
            println(abs(y-x))
        }
    }
}