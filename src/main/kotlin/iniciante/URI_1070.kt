/* -- File created by dev.mgck on 04 jan, 2021 at 17:45 -- */
package iniciante


fun main(args: Array<String>) {
    
    val n = readLine()!!.toInt()
    if (n % 2 == 0 ) {
        for (i in (n+1).rangeTo(n+12).step(2)) println(i)
    } else {
        for (i in n.rangeTo(n+11).step(2)) println(i)
    }
    
}