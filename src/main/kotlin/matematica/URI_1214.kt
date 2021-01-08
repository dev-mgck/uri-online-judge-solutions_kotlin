/* -- File created by dev.mgck on 03 jan, 2021 at 16:35 -- */
package matematica

import java.math.BigDecimal
import java.math.RoundingMode

fun main(args: Array<String>) {

	var count = 0
	val listaNotas = mutableListOf<Int>()
	val listaMedias = mutableListOf<String>()
	var mediaNotas: Double
	var acimaMedia : Double

	for (i in 1..readLine()!!.toInt()) {
		val notas = readLine()!!.split(" ").map { it.toInt() }
		for (j in 1..notas[0]) { listaNotas.add(notas[j]) }

		mediaNotas = (listaNotas.sum() / listaNotas.size).toDouble()
		for (n in listaNotas) { if (n > mediaNotas) { count++ } }

		acimaMedia = ((count.toDouble() / listaNotas.size.toDouble()) * 100)
		val resultado = BigDecimal(acimaMedia).setScale(3, RoundingMode.HALF_EVEN)
		listaMedias.add("$resultado%")
		count = 0
		listaNotas.clear()
	}

	println(listaMedias.joinToString("\n")) // faster way to write many lines
	//for (n in listaMedias) { println("$n%") }

}