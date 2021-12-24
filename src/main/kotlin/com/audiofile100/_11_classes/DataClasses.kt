package com.audiofile100._11_classes

// data class have copy(), toString(), componentN(), equals(), and hashCode() by default
// data objects usually don't change - which is why we normally use val
// if you need to change a property, the convention is to copy, change, disregard old object

data class PersonData(
    val name: String,
    val lastName: String?,
    val age: Int,
    val pet: PetData
)

data class PetData(val name: String, val animalType: String)

fun main() {

    val dog = PetData("Max", "German Shepard Dog")
    val filip = PersonData("Filip", "Babic", 23, dog)

    println(filip)

    val olderFilip = filip.copy(age = filip.age + 10)

    println(olderFilip)

    // deconstructing data classes (uses componentN() where N is the number of property)
    val (name, _, age, pet) = olderFilip
    println(pet)

    val comp1 = olderFilip.component1()
    println(comp1)

    var filipTwo = filip
    println(filipTwo == filip)
    println(filipTwo === filip)

    filipTwo = filip.copy()         // copy() returns a new object
    println(filipTwo == filip)
    println(filipTwo === filip)
}