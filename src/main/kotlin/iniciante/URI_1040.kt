/* -- File created by dev.mgck on 05 jan, 2021 at 12:15 -- */
package iniciante


fun main(args: Array<String>) {
    
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    
    val (N1, N2, N3, N4) = readLine()!!.split(" ").map { it.toFloat() }
    var m = ((N1*2) + (N2*3) + (N3*4) + (N4*1)) / 10
    println("Media: ${m.format(1)}")
    
    if (m >= 7.0) println("Aluno aprovado.")
    else if (m < 7.0 && m >= 5.0) {
        println("Aluno em exame.")
        val N5 = readLine()!!.toFloat()
        println("Nota do exame: ${N5.format(1)}")
        val m2 = (m + N5) / 2
        if (m2 >= 5.0) println("Aluno aprovado.")
        else println("Aluno reprovado.")
        println("Media final: ${m2.format(1)}")
    } else println("Aluno reprovado.")
}