/* -- File created by dev.mgck on 07 jan, 2021 at 15:50 -- */
package adhoc


fun main(args: Array<String>) {

    while (true) {
        val (L, R) = readLine()!!.split(" ").map { it.toInt() }
        if (L == 0 && R == 0) break
        println(L + R)
    }
}