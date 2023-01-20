//Program to check if a number is positive,negative or zero

fun main()
{   println("Enter a number:")
    var a=readLine()?.toInt()
    if(a!=null)
    {
        if(a>0) println("The number is positive")
        else if(a<0) println("The number is negative")
        else println("The number is zero")
    }
}