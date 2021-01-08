/* -- File created by dev.mgck on 04 jan, 2021 at 11:44 -- */
package iniciante


fun main(args: Array<String>) {

    var animalia = ""
    val c1 = readLine()!!
    val c2 = readLine()!!
    val c3 = readLine()!!
    
    when (c1) {
        "vertebrado" -> when (c2) {
            "ave" -> when (c3) {
                "carnivoro" -> animalia = "aguia"
                "onivoro" -> animalia = "pomba"
            }
            "mamifero" -> when (c3) {
                "onivoro" -> animalia = "homem"
                "herbivoro" -> animalia = "vaca"
            }
        }
        "invertebrado" -> when (c2) {
            "inseto" -> when (c3) {
                "hematofago" -> animalia = "pulga"
                "herbivoro" -> animalia = "lagarta"
            }
            "anelideo" -> when (c3) {
                "hematofago" -> animalia = "sanguessuga"
                "onivoro" -> animalia = "minhoca"
            }
        }
    }
    
    println(animalia)

}