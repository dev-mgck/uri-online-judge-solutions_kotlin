/* -- File created by dev.mgck on 03 jan, 2021 at 19:47 -- */
package matematica


fun main(args: Array<String>) {
	
	var s : String
	var n : Int
	val r = """0x.*""".toRegex()
	while(true) {
		s = readLine()!!
		if (s.matches(r)) {
			s = s.substring(2)
			println(Integer.parseInt(s,16))
		} else {
			n = Integer.parseInt(s)
			if (n < 0 ) break
			else println("0x" + n.toString(16).toUpperCase())
		}
	}
}