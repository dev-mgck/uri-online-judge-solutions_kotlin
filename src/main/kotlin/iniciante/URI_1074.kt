/* -- File created by dev.mgck on 04 jan, 2021 at 18:38 -- */
package iniciante


fun main(args: Array<String>) {
    
    for (i in 1..readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        when {
            n == 0 -> println("NULL")
            n > 0 && n % 2 == 0 -> println("EVEN POSITIVE")
            n > 0 && n % 2 != 0 -> println("ODD POSITIVE")
            n < 0 && n % 2 == 0 -> println("EVEN NEGATIVE")
            n < 0 && n % 2 != 0 -> println("ODD NEGATIVE")
        }
    }
}