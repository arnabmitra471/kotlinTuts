fun main()
{
    println("Enter a number to print its multiplication table: ")
    val num = readln().toInt()


    for(i in 1..< 10)
    {
        println("$num x $i = ${num*i}")
    }
    println("Outside the loop")

    for(i in 1..20)
    {
        println(num.toString() +" x "+i.toString()+ " = "+num*i)
    }
    println("Decrementing for loop")

    for(i in 100 downTo 1)
    {
        println(i)
    }
}