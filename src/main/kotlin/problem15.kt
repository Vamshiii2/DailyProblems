//LCM of three numbers
fun main()
{
   println("Enter the first number:")
   var first= readLine()?.toInt()!!
   println("Enter the second number:")
   var second= readLine()?.toInt()!!
    println("Enter the third number:")
    var third= readLine()?.toInt()!!
   var lcm=if(first>second && first >third)
   {
       first
   } else if(second>first && second>third)
   {
       second
   }
    else
    {
        third
    }
    while(true)
    {
        if (lcm % first == 0&& lcm % second == 0 && lcm%third==0)
        {
            break
        }
        lcm++
    }
    println("The lcm of two numbers is $lcm")
}