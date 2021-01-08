/* -- File created by dev.mgck on 06 jan, 2021 at 14:09 -- */
package iniciante

fun main(args: Array<String>) {
    
    fun readlnInt() = readLine()!!.toInt()
    fun readInts() = readLine()!!.split(" ").map { it.toInt() }
    
    var VI = 0
    var VG = 0
    var E = 0
    var J = 0
    
    while (true) {
        var (I, G) = readInts()
        if (I == G) E++
        else if (I > G) VI++
        else VG++
        J++
        println("Novo grenal (1-sim 2-nao)")
        if (readlnInt() == 2) break
    }
    
    println("$J grenais\nInter:$VI\nGremio:$VG\nEmpates:$E")
    if (VI == VG) println("Nao houve vencedor")
    else if (VI > VG) println("Inter venceu mais")
    else println("Gremio venceu mais")
    
}