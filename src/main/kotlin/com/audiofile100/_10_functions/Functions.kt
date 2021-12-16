package com.audiofile100._10_functions

fun main() {

    fun createRange(start: Int, end: Int, isHalfOpen: Boolean = false): IntRange {
        return when {
            isHalfOpen -> start until end
            else -> start .. end
        }
    }

    fun printRange(range: IntRange): Unit {
        for (number in range) print("$number\t")
        println()
    }

    val closedRange = createRange(1, 10)
    printRange(closedRange)

    val halfOpenRange = createRange(1, 10, true)
    printRange(halfOpenRange)

    // if you use one named arg, you have to name all
    val namedArgs = createRange(isHalfOpen = true, start = 2, end = 6)
    printRange(namedArgs)

    // or just at the starting of named arg to last arg
    printRange(createRange(4, 7, isHalfOpen = true))
}