/* -- File created by dev.mgck on 05 jan, 2021 at 11:48 -- */
package iniciante


fun main(args: Array<String>) {
    
    var loop = true
    while (loop) {
        val (X, Y) = readLine()!!.split(" ").map { it.toInt() }
        
        if (X == Y){
            loop = false
        }
        else {
            if (X > Y) {
                println("Decrescente")
            } else {
                println("Crescente")
            }
        }
    }
}