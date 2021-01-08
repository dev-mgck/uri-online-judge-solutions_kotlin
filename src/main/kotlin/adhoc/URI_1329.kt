/* -- File created by dev.mgck on 07 jan, 2021 at 13:23 -- */
package adhoc


fun main(args: Array<String>) {
    
    while (true) {
        val N = readLine()!!.toInt()
        if (N==0) break
        val L = readLine()!!.split(" ").run { IntArray(N) { get(it).toInt() } }
        println("Mary won ${L.count{it==0}} times and John won ${L.count{it==1}} times")
    }
}