/* -- File created by dev.mgck on 05 jan, 2021 at 00:22 -- */
package iniciante


fun main(args: Array<String>) {
    
    var soma : Int
    var loop = true
    var aux : Int
    while (loop) {
        var (M, N) = readLine()!!.split(" ").map { it.toInt() }
        soma = 0
        if (M > N) {
            aux = M
            M = N
            N = aux
        }
    
        if (M <= 0 || N <= 0) {
            loop = false
        }
        if (loop) {
            for (i in M..N) {
                print("$i ")
                soma += i
            }
            print("Sum=$soma\n")
        }
    }
}