//Program to check if a number is even or odd

fun main()
{
    println("Enter a number:")
    var a=readLine()?.toInt()
    if(a!=null)
    {
        if(a %2==0) println("The number is even")
        else println("The number is odd")
    }
}