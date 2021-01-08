/* -- File created by dev.mgck on 07 jan, 2021 at 18:48 -- */
package matematica

fun rafael(x: Int, y: Int) : Int = ((3*x) * (3*x)) + (y * y)
fun beto(x: Int, y: Int) : Int = ((x*x) * 2) + ((5*y) * (5*y))
fun carlos(x: Int, y: Int) : Int = -(100 * x) + (y * y * y)

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    
    for (i in 1..n) {
        
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
        val r = rafael(x, y)
        val b = beto(x, y)
        val c = carlos(x, y)
        
        if ( r > b && r > c ) println("Rafael ganhou")
        else if ( b > r && b > c ) println("Beto ganhou")
        else if ( c > r && c > b ) println("Carlos ganhou")
        
    }
}

