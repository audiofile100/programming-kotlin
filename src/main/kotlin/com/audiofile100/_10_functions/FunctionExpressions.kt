package com.audiofile100._10_functions

fun main() {

    fun createRange(start: Int, end: Int, isHalfOpen: Boolean = false) =
        if (isHalfOpen) {
            start until end
        } else {
            start..end
        }

    fun createRange(start: Char, end: Char, isHalfOpen: Boolean = false) =
        if (isHalfOpen) {
            start until end
        } else {
            start..end
        }

    fun printRange(range: CharRange): Unit {
        for (number in range) print("$number\t")
        println()
    }

    val cRange = createRange('a', 'z')

    printRange(cRange)
}