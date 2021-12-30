package com.audiofile100._12_lambdas

fun main() {

    var prices = arrayOf(1.50, 10.00, 4.99, 2.30, 8.19)

    for (price in prices) {
        print("$price \t")
    }

    println()

    prices.forEach { it
        print("$it \t")
    }

    //prices.forEach(::println)

    println()

    // map returns a new collection
    val salePrices = prices.map { price -> price * 0.9 }
    //val salePrices = prices.map { it * 0.9 }
    println(salePrices)

    // .map { it.toIntOrNull() }
    // .mapNotNull { it.toIntOrNull() }
}