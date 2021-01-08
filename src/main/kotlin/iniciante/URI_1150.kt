/* -- File created by dev.mgck on 05 jan, 2021 at 16:06 -- */
package iniciante


fun main(args: Array<String>) {
    
    var X = readLine()!!.toInt()
    var Z = readLine()!!.toInt()
    var count = 0
    var sum = 0
    while (Z <= X) {
        Z = readLine()!!.toInt()
    }
    while (sum < Z) {
        sum += X
        count++
        X++
    }
    println(count)
    
}