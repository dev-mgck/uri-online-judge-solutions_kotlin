/* -- File created by dev.mgck on 04 jan, 2021 at 13:22 -- */
package iniciante


fun main(args: Array<String>) {
    
    val ddd = readLine()!!.toInt()
    val des: String
    when (ddd) {
        61 -> des = "Brasilia"
        71 -> des = "Salvador"
        11 -> des = "Sao Paulo"
        21 -> des = "Rio de Janeiro"
        32 -> des = "Juiz de Fora"
        19 -> des = "Campinas"
        27 -> des = "Vitoria"
        31 -> des = "Belo Horizonte"
        else -> des = "DDD nao cadastrado"
    }
    println(des)
}