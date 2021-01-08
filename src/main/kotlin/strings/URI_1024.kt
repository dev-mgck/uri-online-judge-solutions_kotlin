/* -- File created by dev.mgck on 06 jan, 2021 at 16:50 -- */
package strings

import java.util.Scanner

fun main(args: Array<String>) {

    val qtd = readLine()!!.toInt()
    
    for (i in 1..qtd) {
        val text = readString().toCharArray()
        val length = text.size
        val half = length / 2
        
        for (x in 0 until length) {
        
        }
    }
    

}

private fun isWhiteSpace(c: Char) = c in " \r\n\t"

private fun readString() = generateSequence { System.`in`.read().toChar() }
    .dropWhile { isWhiteSpace(it) }.takeWhile { !isWhiteSpace(it) }.joinToString("")




