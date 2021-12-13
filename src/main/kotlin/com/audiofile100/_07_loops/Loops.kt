package com.audiofile100._07_loops

fun main() {
    val states = arrayOf(
        "California", "Utah", "Nevada",
        "Massachusetts", "New York", "Virginia"
    )

    var i = 0
    while (i < states.size) {
        println("State at idx $i is ${states[i]}")
        ++i
    }

    // when you know the number of iterations you can use ranges.
    val rng1 = 0..10
    println(rng1)    // inclusive

    val rng2 = 0 until 10
    println(rng2)   // excludes last number

    for (idx in rng1) {
        print(idx)
    }

    println("")

    for (idx in rng1 step 2) {
        print(idx)
    }

    println("")

    for (idx in 10 downTo 0) {                           // 10..0 is empty because step is +1 by default
        print(idx)
    }

    println("\n*** using for to iterate thru collections ***")

    for (stateIdx in 0..states.lastIndex) {
        println("State at range idx $stateIdx is ${states[stateIdx]}")
    }

    println("*** using built-in iteration mechanism ****")
    for (s in states) {
        println("$s")
    }
}