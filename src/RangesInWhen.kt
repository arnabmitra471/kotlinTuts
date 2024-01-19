fun main()
{
    println("Enter a number: ")
    val number = readln().toInt()
    when(number)
    {
        11 -> println("The number is eleven")
        12 -> println("The number is twelve")
        13 -> println("The number is thirteen")
        in 14..30 -> println("The number is in the range 14 to 30")
        else -> println("The number entered is not in range")
    }
}