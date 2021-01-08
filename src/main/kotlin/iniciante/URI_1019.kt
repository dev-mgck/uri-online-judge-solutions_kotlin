/* -- File created by dev.mgck on 02 jan, 2021 at 15:57 -- */
package iniciante


fun main(args: Array<String>) {
    
    val minutos = 60
    val horas = 60
    val segundos = readLine()!!.toInt()
    
    val nHoras = segundos / (horas * minutos)
    val resHoras = segundos % (horas * minutos)
    val nMinutos = resHoras / minutos
    val resMinutos = resHoras % minutos
    
    println("$nHoras:$nMinutos:$resMinutos")
    
}