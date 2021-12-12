package com.audiofile100._02_booleans

fun main(args: Array<String>) {
    val isProgrammingAwesome = true

    println("Is programming awesome? $isProgrammingAwesome")

    val myAge = 23

    val isLegalDrivingAge = myAge >= 18
    println(isLegalDrivingAge)

    val ageTim = 27
    val isTimOlder = ageTim > myAge
    println(isTimOlder)

    val yearOfBirth = 1996

    val isBornInTwentiethCentury = yearOfBirth < 2000
    println(isBornInTwentiethCentury)

    val firstObject = Any()         // Any is a base type that all other types inherit
    val secondObject = Any()

    println("*** reference check ***")
    println(firstObject === secondObject)   // === checks if point to same memory address
    println(firstObject !== secondObject)   // !== negated reference check
}