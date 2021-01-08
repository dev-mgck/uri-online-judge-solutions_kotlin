/* -- File created by dev.mgck on 07 jan, 2021 at 13:57 -- */
package adhoc

import java.io.EOFException

fun main(args: Array<String>)  {
    
    while (true) {
        try {
            val (A, B, C) = readLine()!!.split(" ").map { it.toInt() }
            if ( A == B && B == C && A == C ) { println("*") }
            else {
                if ( A == B ) println("C")
                else {
                    if (A == C) println("B")
                    else println("A")
                }
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