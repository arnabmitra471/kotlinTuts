fun main()
{
    println("Enter first number: ")
    val num1 = readln().toInt()
    println("Enter second number: ")
    val num2 = readln().toInt()
    val result:Int = add(num1,num2)
    println("The sum is "+result)
}
fun add(a:Int,b:Int):Int
{
    val sum:Int = a + b
    return sum
}