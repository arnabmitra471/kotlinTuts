fun main()
{
    val mustang = Car("mustang","Petrol",10.0)
    val ford = Car("Ford","Petrol",40.30)
    println(mustang.name)
    println(mustang.type)
    println(mustang.kmRan)
    println(ford.name)
    println(ford.type)
    println(ford.kmRan)

}
class Car(val name:String,val type:String,var kmRan:Double)
{
    fun driveCar()
    {
        println(" The car is being driven")
    }
    fun changeGear(gearNo:Int)
    {
        println("Changing gear to "+gearNo+"th"+" gear")
    }

}