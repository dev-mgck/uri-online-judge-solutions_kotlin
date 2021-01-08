/* -- File created by dev.mgck on 08 jan, 2021 at 11:39 -- */
package iniciante


fun main(args: Array<String>) {
    
    val t = readLine()!!.toInt()
    
    for (i in 1..t) {
        
        val (j1, j2) = readLine()!!.split(" ").map { it }
        if (j1 == j2) println("Caso #$i: De novo!")
        else if ( j1 == "tesoura" && j2 == "papel" ) println("Caso #$i: Bazinga!")
        else if ( j1 == "papel" && j2 == "pedra" ) println("Caso #$i: Bazinga!")
        else if ( j1 == "pedra" && j2 == "lagarto" ) println("Caso #$i: Bazinga!")
        else if ( j1 == "lagarto" && j2 == "Spock" ) println("Caso #$i: Bazinga!")
        else if ( j1 == "Spock" && j2 == "tesoura" ) println("Caso #$i: Bazinga!")
        else if ( j1 == "tesoura" && j2 == "lagarto" ) println("Caso #$i: Bazinga!")
        else if ( j1 == "lagarto" && j2 == "papel" ) println("Caso #$i: Bazinga!")
        else if ( j1 == "papel" && j2 == "Spock" ) println("Caso #$i: Bazinga!")
        else if ( j1 == "Spock" && j2 == "pedra" ) println("Caso #$i: Bazinga!")
        else if ( j1 == "pedra" && j2 == "tesoura" ) println("Caso #$i: Bazinga!")
        else println("Caso #$i: Raj trapaceou!")
        
    }
}