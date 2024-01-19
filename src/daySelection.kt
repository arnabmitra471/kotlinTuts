fun main()
{
    /*Display a message telling the user
    which day it is based on the day no. entered by him/her
     */
    println("Enter a day no.. :")
    val dayNo = readln().toInt()
     val result = when(dayNo)
    {
        0 -> "Sunday"
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        else -> "Invalid day no: "
    }
    println("The day is $result")



}