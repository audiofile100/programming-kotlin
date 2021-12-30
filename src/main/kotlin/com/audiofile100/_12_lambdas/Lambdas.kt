package com.audiofile100._12_lambdas

fun main() {
    // lambda is a function with no name (anonymous function)

    fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    // lambda return last expression in the body
    val addLambda = { a: Int, b: Int ->
        a + b
    }

    println(operateOnNumbers(3, 2, addLambda))
    println(operateOnNumbers(3, 2, operation = { a, b -> a + b }))
    println(operateOnNumbers(3, 2, operation = Int::plus))                      // function reference

    var counter = 0
    val inc = {
        counter += 1            // lambda captures variable (any changes made is visible to outside as well)
    }

    inc()
    inc()
    inc()

    println(counter)        // 3

    // higher order function (function that takes function as parameter or return a function)
    fun countingLambda(): () -> Int {
        var counter = 0
        val incCounter: () -> Int = {
            counter += 1
            counter                         // returns last expression
        }
        return incCounter
    }

    val counter1 = countingLambda()
    val counter2 = countingLambda()

    println(counter1())
    println(counter1())
    println(counter1())
    println(counter2())
    println(counter2())
    println(counter2())
}