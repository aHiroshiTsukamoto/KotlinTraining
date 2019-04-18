package io.access.kotlintraining

fun welcome() {
    println("welcome to ACCESS!")
}

// TODO: declare hello function
fun helloWorld() {
    println("Hello World!")
}

fun fizzbuzz(n : Int) : String{
    if (n % 15 == 0){
        return "FizzBuzz"
    }
    else if (n % 5 == 0){
        return "Buzz"
    }
    else if (n % 3 == 0){
        return "Fizz"
    }
    else{
        return Integer.toString(n)
    }
}