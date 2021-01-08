/* -- File created by dev.mgck on 07 jan, 2021 at 09:20 -- */
package iniciante


fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    val x = readLine()!!.split(" ").run { IntArray(n) { get(it).toInt() } }
    var i = 0
    var v = x[0]
    for (k in 1.until(x.size)) {
        if (x[k] < v) {
            v = x[k]
            i = k
        }
    }
    println("Menor valor: $v\nPosicao: $i")
}