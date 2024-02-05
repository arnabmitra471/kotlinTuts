/*
When we create a class we actually our own data type. A class is a blueprint to create objects.
A separate memory is allocated to every of a class and each object has its own copy
of properties and methods

 */
fun main()
{
    val s1  = Student("Vrinda",23,67)
    val s2 = Student("Arnab",5,89)
    val s3 = Student("Shaarav",12,56)
    println(s1)
    println(s2)
    println(s3)

    s1.display()
    s2.display()
    s3.display()
    val newMarks_s1 = s1.addGrace(45)
    val newMarks_s2 = s2.addGrace(60)
    val newMarks_s3 = s3.addGrace(98)
    println("The new marks after adding grace value to Student 1's marks is $newMarks_s1")
    println("The new marks after adding grace value to Student 2's marks is $newMarks_s2")
    println("The new marks after adding grace value to Student 3's marks is $newMarks_s3")
}
 class Student(var name:String ,val rollNo:Int,var marks:Int) {
     fun addGrace(grace: Int): Int {
         marks += grace
         return marks
     }

     fun display() {
         println("The name of the student is $name")
         println("The roll no of the student is $rollNo")
         println("The marks of the student is $marks")
     }
 }