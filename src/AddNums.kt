// Obtain the sum of first n natural numbers in Kotlin
fun main()
{
    var i = 1
    var sum =0
    val n:Int
    println("Enter the number of terms to be added: ")
    n = readln().toInt()
    while(i<=n)
    {
        sum += i
        i++
    }
    println("The sum of the numbers is $sum")

}