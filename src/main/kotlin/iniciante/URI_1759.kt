/* -- File created by dev.mgck on 07 jan, 2021 at 21:50 -- */
package iniciante


fun main(args: Array<String>) {

    val n = readLine()!!.toLong()
    val list = mutableListOf<String>()
    for (i in 1..n) { list.add("Ho") }
    println("${list.joinToString(" ")}!")
    
}