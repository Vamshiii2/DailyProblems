fun main() {
    println("Enter the value of n:")
    var n = readLine()?.toInt()!!
    //println("Enter the value of a:")
    //var a = readLine()?.toInt()!!
    var a=1
    for (i in 1..10) {
       a = n * i
        println("$n*$i=$a")
    }
}
