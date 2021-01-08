/* -- File created by dev.mgck on 02 jan, 2021 at 18:56 -- */
package adhoc


fun main(args: Array<String>) {

  val input = readLine()!!
  val cv = (input.split(" ")[0].toInt()) * 3 // vitória -> 3 pontos
  val ce = input.split(" ")[1].toInt()
  val cs = input.split(" ")[2].toInt()
  val fv = (input.split(" ")[3].toInt()) * 3
  val fe = input.split(" ")[4].toInt()
  val fs = input.split(" ")[5].toInt()

  when {
    (cv + ce) > (fv + fe) -> println("C") // C com maior saldo de pontos
    (cv + ce) < (fv + fe) -> println("F") // F com maior saldo de pontos
    (cv + ce) == (fv + fe) && cs > fs -> println("C") // C ganha no saldo de gols
    (cv + ce) == (fv + fe) && cs < fs -> println("F") // F ganha no saldo de gols
    (cv + ce) == (fv + fe) && cs == fs -> println("=") // Empate
  }

}