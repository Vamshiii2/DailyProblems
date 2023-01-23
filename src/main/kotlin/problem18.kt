//Program to display fibonacci series
fun main()
{
    println("Enter a number:")
    var a= readLine()?.toInt()!!
    var list= mutableListOf<Int>(0,1)
        for (i in 2..a - 1)
            list.add(list[i - 2] + list[i - 1])
        println(list)


}