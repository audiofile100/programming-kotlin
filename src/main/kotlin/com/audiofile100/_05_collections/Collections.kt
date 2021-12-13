package com.audiofile100._05_collections

fun main() {
    val name = "Filip"
    val lastName = "Babic"
    val age = 23

    val fullName = Pair<String, String>("Filip", "Babic")
    println("My name is ${fullName.first}, ${fullName.second}")

    val (a, b) = fullName           // destructuring
    println("My name is $a, $b")

    val person = Triple<String, String, Int>("Filip", "Babic", 23)
    println("Name: ${person.first}, ${person.second}, age: ${person.third}")

    val (d, e, f) = person
    println("Name: $d, $e age: $f")

    // omitting values with underscore when destructuring
    val (d1, _, f1) = person
    println("Name: $d1 age: $f1")
}