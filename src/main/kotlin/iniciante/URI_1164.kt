/* -- File created by dev.mgck on 06 jan, 2021 at 18:31 -- */
package iniciante


fun main(args: Array<String>) {
    
    for (i in 1..readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        var sum = 0
        for (j in 1.until(n)) if (n % j == 0) sum += j
        if (sum == n) println("$n eh perfeito")
        else println("$n nao eh perfeito")
    }
}