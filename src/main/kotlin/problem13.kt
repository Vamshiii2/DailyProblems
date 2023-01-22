//Program to find factorial of a given number
fun main()
{
    println("Enter a number:")
    var a= readLine()?.toInt()!!
    var fact=1
    if(a==0)
    {
        println("1")
    }
    else
    {
        for(i in 1..a)
        {
            fact=fact*i
        }
        println("$fact")
    }

}