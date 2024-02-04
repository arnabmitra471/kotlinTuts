fun main()
{
    println("Enter a integer value: ")
    val num1:Int = readln().toInt()
    println("Enter another integer value: ")
    val num2:Int = readln().toInt()
    println("Enter a float value")
    val num3:Float = readln().toFloat()
    println("Enter a double value: ")
    val num4: Double = readln().toDouble()
    println("Enter another double value: ")
    val num5:Double = readln().toDouble()
    val res1 = sum(num1,num2)
    println("The sum in case 1 is: $res1")
    val res2 = sum(num4,num5)
    println("The sum in case 2 is: $res2")
    val res3 = sum(num1,num2,num3)
    println("The sum in case 3 is $res3")
}
fun sum(a:Int,b:Int):Int
{
    return a + b
}
fun sum(a:Double,b:Double):Double
{
    return a + b
}
fun sum(a:Int,b:Int,c:Float):Float
{
    return a + b + c
}