fun main()
{
    println("Enter the number of terms: ")
    val nterms:Int = readln().toInt()

   for(i in 0..<nterms)
   {
       val fibRes:Int = fibonacci(i)
       print(" $fibRes")
   }

}
fun fibonacci(n:Int):Int
{
    if(n==0 || n == 1)
        return n
    else
    {
        return fibonacci(n-1) + fibonacci(n-2)
    }
}