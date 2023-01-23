//To find  the factor of a number

fun main()
{
    println("Enter a number:")
    var a=readLine()?.toInt()!!
    var factor=1
    var i=1
    var list= mutableListOf<Int>()
    while(i<=a)
    {
        if (a % i == 0)
        {
            factor = i
            list.add(factor)
        }
        i++
    }
    println("The factors of $a are $list")
}