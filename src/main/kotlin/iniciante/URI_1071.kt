/* -- File created by dev.mgck on 04 jan, 2021 at 17:59 -- */
package iniciante


fun main(args: Array<String>) {
    
    val ln = mutableListOf<Int>()
    val li = mutableListOf<Int>()
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    if (n1 < n2) ln.addAll(listOf(n1, n2)) else ln.addAll(listOf(n2, n1))
    for (i in (ln[0]+1)..(ln[1]-1)) {
        if (i % 2 != 0) {
            li.add(i)
            
        }
    }
    println("${li.sum()}")
    
}