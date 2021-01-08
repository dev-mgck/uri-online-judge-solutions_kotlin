/* -- File created by dev.mgck on 02 jan, 2021 at 20:08 -- */
package iniciante


fun main(args: Array<String>) {
    
    var loop = true
    while (loop) {
        val (X, Y) = readLine()!!.split(" ").map { it.toInt() }
        
        if (X == 0 || Y == 0){
            loop = false
        }
        else {
            when {
                X > 0 && Y > 0 -> println("primeiro")
                X > 0 && Y < 0 -> println("quarto")
                X < 0 && Y < 0 -> println("terceiro")
                X < 0 && Y > 0 -> println("segundo")
            }
        }
    }
}