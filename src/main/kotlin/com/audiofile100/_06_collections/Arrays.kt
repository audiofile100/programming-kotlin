package com.audiofile100._06_collections

fun main() {
    // array is static (fixed size)
    // accessing is O(1)
    // iterating is O(n)

    val states = arrayOf(
        "California", "Utah", "Nevada",
        "Massachusetts", "New York", "Virginia"
    )

    println(states[1])

    val sizedArray = Array(10) {""}
    val emptyArray = emptyArray<String>()

    val arrayOfInts = intArrayOf(2, 4, 6, 8)
    val arrayOfZero = IntArray(10)

    println(arrayOfInts.first())
    println(arrayOfInts.last())
    println(arrayOfInts.lastIndex)

    val num = 9

    println("arrayOfInts contains $num? " + arrayOfInts.contains(num))
    println("$num in arrayOfInts? " + (num in arrayOfInts))                 // !in
}