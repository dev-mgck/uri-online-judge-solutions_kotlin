/* -- File created by dev.mgck on 05 jan, 2021 at 16:24 -- */
package iniciante


fun main(args: Array<String>) {
    
    val n = readLine()!!.toInt()
    var t1 = 0
    var t2 = 1
    var sum : Int
    
    // avoid infix function "until" when submit/send your code
    for (i in 1..(n-1)) {
        print("$t1 ")
        
        sum = t1 + t2
        t1 = t2
        t2 = sum
    }
    print("$t1")
    println()
    
}