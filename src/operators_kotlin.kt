fun main(){
    var num1 = 34
    var num2 = 21
    // arithmetic operators
    var sum = num1 + num2
    var diff = num1 - num2
    var prod = num1 * num2
    var quot = num1/num2
    var rem = num1 % num2
    println("The sum is "+sum)
    println("The difference is "+diff)
    println("The product is "+prod)
    println("The quotient after division is "+quot.toFloat())
    println("The remainder after division is "+rem)

    // Relational Operators
    println(num1 > num2) // Output: true
    println(num1 < num2) // Output: false
    println(num1 >= num2) // Output: true
    println(num1 <= num2) // Output: false
    println(num1 == num2) // Output: false
    println(num1 != num2) // Output: true

    // Increment and decrement operators
    var a = 5
    println("The value of a is "+a++)
    println("The incremented value of a is "+a)
    println("The incremented value of a is "+(++a))
    println("The  value of a is "+(a--))
    println("The value after decrementing a is "+a)

    var b = 56
//    println("The value of b is "+(b--))
//    println("The value after decrementing b is "+b)
//    println("The value after decrementing b is "+(--b))

    println(b++ + ++b) // (56 = 56 + 1 = 57) + (56 + 1 = 57)
    /*println(b)
    println(++b)*/
}