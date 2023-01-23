//Temperature conversions
fun main()
{
    println("Enter temperature in celsius:")
    var c= readLine()?.toDouble()!!
    var f=c*9/5+32
    var k=273+c
    println("The temperature in celsius is :$c")
    println("The temperature in farenheit is :$f")
    println("The temperature in kelvin scale is:$k")


}