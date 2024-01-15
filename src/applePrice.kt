fun main()
{
    /* println("Enter the apple price: ")
    val applePrice = Scanner(System.`in`)
        if (applePrice.nextInt() >= 100) {
            println("Alexa add 1 kg apples to the cart")
        }
        else
        {
            println("Alexa don't add 1 kg apples to the cart")
        }
        */
    println("Enter your marks: ")
    val marks = readln().toInt()

        if(marks ==100)
            println("Congratulations you are eligible for hiring")

        else if(marks in 80 .. 100 )
            println("You have sufficient amount of marks anyway")

        else if(marks in 65..75)
            println("You have a fair amount of marks")

        else
            println("You are not hired at all !!!!")


}