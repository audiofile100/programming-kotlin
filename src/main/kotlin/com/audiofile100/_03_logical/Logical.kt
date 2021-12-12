package com.audiofile100._03_logical

fun main() {

    val myAge = 12
    val country = "USA"

    if (myAge >= 16) {
        println("Legal to drive")
    } else {
        println("Illegal to drive")
    }

    // kotlin convention for simple if-else is to write one-line
    if (myAge >= 16) println("Legal to drive") else println("Illegal to drive")

    // notice above we have repeated println - we can call it once
    // because if-else are expressions - they can be assigned
    val ageMsg = if (myAge >= 18) "I'm an adult." else "I'm underaged."
    println(ageMsg)

    // or forget assigning it
    println(if (myAge >= 18) "I'm an adult." else "I'm underaged.")
}