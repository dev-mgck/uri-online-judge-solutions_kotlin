/* -- File created by dev.mgck on 07 jan, 2021 at 22:14 -- */
package iniciante

import java.io.EOFException

fun main(args: Array<String>) {
    
    while (true) {
    
        try {
        
            val l = readLine()!!.toInt()
            val v = readLine()!!.split(" ").run {  IntArray(l) { get(it).toInt() } }
            v.sort()
            when (v.last()) {
                in 0.until(10) -> println(1)
                in 10.until(20) -> println(2)
                else -> println(3)
            }
    
        } catch (f : NumberFormatException) {
            break
        } catch (n : NullPointerException) {
            break
        } catch (e : EOFException) {
            break
        }
    }
}