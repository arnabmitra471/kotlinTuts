fun main() {

    do{
        println("1. Celsius to fahrenheit: ")
        println("2. Fahrenheit to celsius: ")
        println("3. Celsius to kelvin")
        println("4. Kelvin to celsius")
        println("5. Exit")
        println("Enter your choice: ")
        val choice = readln().toInt()
        when (choice) {
            1 -> {
                println("Enter the temperature in celsius")
                val celsius = readln().toFloat()
                val fahrenheit = (celsius * 9 / 5) + 32
                println("The temperature in fahrenheit is $fahrenheit")

            }

            2 -> {
                println("Enter the temperature in fahrenheit: ")
                val fahrenheit = readln().toFloat()
                val celsius = (fahrenheit - 32) * 5 / 9
                println("The temperature in celsius is $celsius")
            }

            3 -> {
                println("Enter the temperature in celsius: ")
                val celsius = readln().toFloat()
                val kelvin = celsius + 273
                println("The temperature in kelvin is $kelvin")
            }

            4 -> {
                println("Enter the temperature in kelvin: ")
                val kelvin = readln().toFloat()
                val celsius = kelvin - 273
                println("The temperature in celsius is $celsius")
            }
        }
    }while(choice != 5)

}