fun main() {
    println("Enter a number: ")
    val num = readln().toInt()
    val result: Boolean = primeNum(num)
    if (result) {
        println("The number is not prime")
    } else {
        println("The number is prime")
    }
}

fun primeNum(n: Int): Boolean
{
    var flag = false
    for (i in 2..n / 2) {
        if (n % i == 0) {
            flag = true
            break
        }
        flag = false
    }
    return flag
}