//Program for swapping of two numbers

fun main()
{
    println("Enter a:")
    var a=readLine()?.toInt()
    println("Enter b:")
    var b=readLine()?.toInt()
    if(a!=null && b!=null)
    {
        a = a + b
        b = a - b
        a = a - b
    }
    println("a value after swapping:$a")
    println("b value after swapping:$b")
}