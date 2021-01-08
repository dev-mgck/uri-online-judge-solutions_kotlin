/* -- File created by dev.mgck on 05 jan, 2021 at 17:37 -- */
package matematica

fun main(args: Array<String>) {
    
    val input = readLine()!!.split(" ").map { it.toInt() }.iterator()
    
    while (input.hasNext()) {
        val n = readLine()!!.toInt()
        val m = readLine()!!.toInt()
        println(fact(n) + fact(m))
    }
    input.hasNext().not()
}

fun fact(f : Int): Long {
    var sum : Long= 1
    for (i in 1..f) {
        sum *= i
    }
    return sum
}
