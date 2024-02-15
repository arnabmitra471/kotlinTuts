fun main()
{
    val car1 = Automobile("Toyota",4,8,true,"Petrol")
    val car2 = Automobile("Audi",4,10,true,"Petrol")
    var car3 = Automobile("Bus","Diesel")

    car1.drive()
    car1.applyBrakes()
    car1.showDetails()
    car2.drive()
    car2.applyBrakes()
    car2.showDetails()

    car3.drive()
    car3.applyBrakes()



    val p1 = Person("Arnab",23)
    println(p1.name)
    println(p1.age)
    p1.showDetails()
}
class Automobile(var name:String,var tyres:Int,var maxSeating:Int, var hasAirBags:Boolean,var engineType:String)
{
    init
    {
        name = "Van"
        tyres = 4
        maxSeating = 15
        hasAirBags = false
        engineType = "Diesel"
    }
    init
    {
        println("2nd initializer block")
    }
     fun drive()
     {
         println("The vehicle is driving")
     }
    fun applyBrakes()
    {
        println("Applied brakes")
    }
    fun showDetails()
    {
        println("The name of the car is "+name)
        println("The number of tyres in the car is "+tyres)
        println("The max no. of seats is "+maxSeating)
        println(hasAirBags)
    }
    constructor(nameParam:String,engineParam:String):this(nameParam,4,5,true,engineParam)
    {
        println("The name is $nameParam")
        println("The engine type is $engineParam")
    }
}
class Person(nameParam:String, ageParam:Int)
{
    val name:String = nameParam
    val age:Int = ageParam

    fun showDetails()
    {
        println("The name of the person is $name")
        println("The age of the person is $age")
    }

}