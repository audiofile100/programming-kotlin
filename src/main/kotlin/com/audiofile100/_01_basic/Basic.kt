package com.audiofile100._01_basic

fun main(args: Array<String>) {
    var myAge: Int = 23
    val name: String = "Filip"
    val lastName = "Babic"          // type inference
    val weight = 63.5

    println(name)
    println("I am $myAge years old")    // $ for string interpolation

    myAge += 1
    println("I am $myAge years old")

    println("$name $lastName is $myAge years old, and weighs $weight kg")

    val fullName = "$lastName, $name"
    println(fullName)

    val ageAsString: String = myAge.toString()
    println(ageAsString)

    val ageFromString = "35".toInt()
    println(ageFromString)

    val nameLength: Int = fullName.length
    println(nameLength)
}