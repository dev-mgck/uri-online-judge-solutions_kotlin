/* -- File created by dev.mgck on 05 jan, 2021 at 14:18 -- */
package iniciante


fun main(args: Array<String>) {
    
    fun isWhiteSpace(c: Char) = c in " \r\n\t"
    
    fun readString() = generateSequence { System.`in`.read().toChar() }
        .dropWhile { isWhiteSpace(it) }.takeWhile { !isWhiteSpace(it) }.joinToString("")
    
    fun readInt() = readString().toInt()
    
    var sum = 0
    var A = readInt()
    var N = readInt()
    while (N <= 0) { N = readInt() }
    for (i in 1..N) {
        sum += A
        A++
    }
    println(sum)
}
