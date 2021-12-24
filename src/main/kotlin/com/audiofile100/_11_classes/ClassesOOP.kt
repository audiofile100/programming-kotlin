package com.audiofile100._11_classes

class EncapsulatedPerson(
    private val name: String,
    private val lastName: String?,
    private var age: Int
) {
    fun setAge(age: Int) {
        if (age in 0..130) {
            this.age = age
        } else {

        }
    }

    fun getAge() = age

    fun getFullInfo(): String {
        return "Full Name: $lastName, $name, Age: $age"
    }
}

fun main() {

    val filip = EncapsulatedPerson("Filip", "Babic", 23)
    println(filip.getFullInfo())

    filip.setAge(24)
    println(filip.getFullInfo())
}