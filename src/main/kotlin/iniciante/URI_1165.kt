/* -- File created by dev.mgck on 06 jan, 2021 at 18:45 -- */
package iniciante


fun main(args: Array<String>) {
    
    for (i in 1..readLine()!!.toInt()) {
        var count = 0
        val n = readLine()!!.toInt()
        
        for (k in 2..(n-1)) if (n % k == 0) count++
        
        if (count == 0) println("$n eh primo")
        else println("$n nao eh primo")
    }
}