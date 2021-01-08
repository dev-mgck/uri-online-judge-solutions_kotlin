/* -- File created by dev.mgck on 05 jan, 2021 at 20:10 -- */
package iniciante

fun main(args: Array<String>) {
    
    fun readlnInt() = readLine()!!.toInt()
    fun readInts() = readLine()!!.split(" ").map { it.toInt() }
    
    for (i in 1..readlnInt()) {
        val (X, Y) = readInts()
        
        var j = X
        var sum = 0
        var count = 0
        
        while (count < Y) {
            if (j % 2 != 0) {
                sum += j
                count ++
            }
            j++
        }
        println(sum)
    }
}

