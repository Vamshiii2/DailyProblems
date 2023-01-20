//Program on simple interest

fun main()
{   println("Enter principle:")
    var p=readLine()?.toFloat()
    println("Enter time:")
    var t=readLine()?.toFloat()
    println("Enter rate of interest:")
    var r=readLine()?.toFloat()
    if(p!=null && t!=null && r!=null)
    {
        var si=(p*t*r)/100
        println("Simple interest is $si")
    }
}