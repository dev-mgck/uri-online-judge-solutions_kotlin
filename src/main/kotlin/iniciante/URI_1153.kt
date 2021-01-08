/* -- File created by dev.mgck on 05 jan, 2021 at 16:38 -- */
package iniciante


fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    var sum = 1
    for (i in 1..N) {
        sum *= i
    }
    println(sum)

}