package com.audiofile100._11_classes

class Person(var name: String, var lastName: String?, var age: Int)     // can set properties via constructor by adding val or var

class Empty

fun main() {

    val filip = Person("Filip", "Babic", 23)

    println("Name: ${filip.name}, Last Name: ${filip.lastName}, Age: ${filip.age}")

    val marin = Person("Marin", null, 23)

    println("Name: ${marin.name}, Last Name: ${marin.lastName}, Age: ${marin.age}")

    val filipClone = filip
    filipClone.age = 24

    val filipTwo = Person("Filip", "Babic", 24)

    println(filip == marin)
    println(filip == filipClone)
    println(filip == filipTwo)
}