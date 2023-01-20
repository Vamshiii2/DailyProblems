//Program to find largest of three numbers

fun main(){
    println("enter x:")
    var x=readLine()?.toInt()

    println("enter y:")
    var y=readLine()?.toInt()

    println("enter z:")
    var z=readLine()?.toInt()

    if(x!=null && y!=null && z!=null && x>y && x>z)
        println("x is greater")
    else if(x!=null && y!=null && z!=null && y>x&&y>z)
        println("y is greater")
    else
        println("z is greater")

}