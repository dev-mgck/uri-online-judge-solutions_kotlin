/* -- File created by dev.mgck on 02 jan, 2021 at 22:30 -- */
package iniciante


fun main(args: Array<String>) {

  val n = readLine()!!.toInt()
  var count = 0
  var a = 1; var b = 2; var c = 3

  while (count < n) {
    println("$a $b $c PUM")
    c+=2  // c -> 5
    a = c // 1 -> 5
    b = c // 2 -> 5
    b++ // 5 -> 6
    c+=2 // 5 -> 7
    count++ // 0 -> 1
  }

}