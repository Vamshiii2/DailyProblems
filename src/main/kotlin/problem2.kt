//Program to input integer,float,double numbers and strings

fun main(){
    println("Enter the integer no:")
    var x=readLine()?.toInt()
    println("Intger no :$x")

    println("Enter the float no:")
    var y=readLine()?.toFloat()
    println("Float no :$y")

    println("Enter the Double no:")
    var z=readLine()?.toDouble()
    println("Double no :$z")

    println("Enter a string:")
    var a=readLine()
    println("String is:$a")

}