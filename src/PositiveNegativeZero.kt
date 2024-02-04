fun main()
{
    println("Enter a number: ")
    val num = readln().toInt()
    posNegZero(num)
}

fun posNegZero(n:Int)
{
    if(n >0)
    {
        println("The number is positive")
        when(n)
        {
            in 1..10 -> println("The number entered lies within 1 to 10")
            in 11..20 -> println("The number entered lies within 11 to 20")
            in 21..30 -> println("The number entered lies within 21 to 30")
            in 31..40 -> println("The number entered lies within 31 to 40")
            else -> println("The number entered is not in range")
        }
    }
    else if(n==0)
    {
        println("The number is zero")
    }
    else
        println("The number is negative")
}