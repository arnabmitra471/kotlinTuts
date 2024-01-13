fun main()
{
    // &&(logical AND)
    val above70 = false
    val knowsProgramming = true

    var calledForInterview = above70 && knowsProgramming
    println(calledForInterview)

    // ||(logical OR)
    calledForInterview = above70 || knowsProgramming
    println(calledForInterview)

    val i = 11
    var j = 11
    val result = i == 11 || j++ == 11
    println("The value of i is "+i)
    println("The value of j is "+j)
    println(result)

    val isSelected = true
    println(!(!isSelected))

}