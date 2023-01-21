fun main()
{
    var a= arrayOf(2,3,4,6,5)
    var max=a[0]
    for(i in a)
    {
        if(i>max)
            max=a[i]
    }
    println("largest no is :${max}")
}