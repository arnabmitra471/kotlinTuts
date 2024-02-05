fun main()
{
    var marks: Array<Int> = arrayOf(32,76,98,12,87,983,564,565,786)
    println(marks)
    for((i,element) in marks.withIndex())
    {
        println("Index $i - $element")
    }
    println(marks[0])
    println(marks[1])
    println(marks[2])
    println(marks[3])
    println(marks[4])
    println(marks[5])

    marks[3] = 1803
    println()
    println(marks[3])

    println("The size of the array is "+marks.size)


}