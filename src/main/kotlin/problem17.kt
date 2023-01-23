//To calculate the GCD/HCF
fun main()
{   println("Enter the first number:")
    var first= readLine()?.toInt()!!
    println("Enter the second number:")
    var second= readLine()?.toInt()!!
    println("Enter the third number:")
    var third= readLine()?.toInt()!!

    var hcf=1
    var i=1
    while(i<=first && i<=second && i<=third)
    {
        if(first%i==0 && second%i==0 && third%i==0)
            hcf=i
        i++
    }
    println("The hcf is:$hcf")
}