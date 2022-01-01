package com.audiofile100._18_inheritance

data class Grade(val course: String, val letter: Char, val credits: Double)

open class Person(var firstName: String, var lastName: String) {    // must specify open class for subclassing
    fun fullName() = "$firstName $lastName"
}

class Student(firstName: String, lastName: String,
              var grades: MutableList<Grade> = mutableListOf<Grade>()) : Person(firstName, lastName) {

    fun recordGrade(grade: Grade) {
        grades.add(grade)
    }
}

fun main() {

    val jon = Person(firstName = "Jon", lastName = "Snow")
    val jane = Student(firstName = "Jane", lastName = "Smith")

    println(jon.fullName())
    println(jane.fullName())

    val robotics = Grade(course = "Robotics", letter = 'A', credits = 3.0)

    jane.recordGrade(robotics)

    println(jane.grades)
}