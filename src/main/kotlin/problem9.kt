fun main(args: Array<String>) {
    println("Enter a  value:")
    var esum = 0
    var osum = 0
    var a = readLine()?.toInt()!!



    for (i in 0..a) {
        if (i% 2 == 0) {
            esum+=i
        } else {
            osum+=i
        }
    }
    println("sum of   is ${esum}")
    println("sum of   is ${osum}")
}

