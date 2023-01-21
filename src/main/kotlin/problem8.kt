//To check if a year is leap year or not
fun main()
{
    println("Enter a year:")
    var a= readLine()?.toInt()!!
    if(a%4==0) println("Leap year")
    else println("Not a leap year")
}