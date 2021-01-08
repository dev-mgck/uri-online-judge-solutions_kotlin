/* -- File created by dev.mgck on 04 jan, 2021 at 15:00 -- */
package iniciante

fun main(args: Array<String>) {
    
    val m = listOf("January", "February", "March", "April",
        "May", "June","July", "August",
        "September", "October", "November", "December")
    val i = readLine()!!.toInt()
    println(m[i-1])
    
}