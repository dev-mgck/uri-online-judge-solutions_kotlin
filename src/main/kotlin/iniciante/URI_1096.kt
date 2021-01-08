/* -- File created by dev.mgck on 04 jan, 2021 at 21:03 -- */
package iniciante


fun main(args: Array<String>) {
    
    var I = 1; var J = 7
    while (I <= 9) {
        
        for (i in 1..3) {
            println("I=$I J=$J")
            J -= 1
        }
        J = 7
        I += 2
    }
}