/* -- File created by dev.mgck on 04 jan, 2021 at 09:30 -- */
package iniciante


fun main(args: Array<String>) {
    
    var aux : Double = 0.0
    var (a, b, c) = readLine()!!.split(" ").map { it.toDouble() }
    
    if ( b > a && b > c) {
        aux = a
        a = b
        b = aux
    } else if (c > a) {
        aux = a
        a = c
        c = aux
    }
    
    if (a >= (b + c)) println("NAO FORMA TRIANGULO")
    else {
        if (a*a == (b*b) + (c*c)) println("TRIANGULO RETANGULO")
        if ((a*a) > (b*b) + (c*c)) println("TRIANGULO OBTUSANGULO")
        if ((a*a) < (b*b) + (c*c)) println("TRIANGULO ACUTANGULO")
        if ( a == b && a == c) println("TRIANGULO EQUILATERO")
        if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) println("TRIANGULO ISOSCELES")
    }
}