/* -- File created by dev.mgck on 07 jan, 2021 at 11:42 -- */
package adhoc

fun main(args: Array<String>) {
    
    val X = readLine()!!.toInt()
    val L = mutableListOf<Int>()
    for (i in 1..X) { L.add(readLine()!!.toInt()) }
    val S = L.toSortedSet()
    val L2 = S.toList()
    for (k in 0.until(L2.size)) {
        println("${L2[k]} aparece ${L.count{ it == L2[k] }} vez(es)")
    }
}