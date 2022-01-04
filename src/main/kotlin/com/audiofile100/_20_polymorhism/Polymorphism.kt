package com.audiofile100._20_polymorhism

data class Grade(val course: String, val letter: Char, val credits: Double)

open class Person(var firstName: String, var lastName: String) {    // must specify open class for subclassing
    fun fullName() = "$firstName $lastName"
}

open class Student(firstName: String, lastName: String,
                   var grades: MutableList<Grade> = mutableListOf<Grade>()) : Person(firstName, lastName) {

    open fun recordGrade(grade: Grade) {        // must specify open for overriding
        grades.add(grade)
    }
}

class StudentAthlete(firstName: String, lastName: String): Student(firstName, lastName) {
    var isEligible: Boolean = true

    override fun recordGrade(grade: Grade) {
        super.recordGrade(grade)
        isEligible = grades.filter { it.letter == 'F' }.size < 3
        if (!isEligible) {
            println("Must study harder to play sports.")
        }
    }
}

fun main() {
    val jon = Person(firstName = "Jon", lastName = "Snow")
    val jane = Student(firstName = "Jane", lastName = "Smith")
    val marty = StudentAthlete(firstName = "Marty", lastName = "McWolf")

    val persons = arrayOf(jon, jane, marty)
    val students = arrayOf(jane, marty)

    persons.forEach { person ->
        println("${person.fullName()} is a person!")
        if (person is Student) println(person.grades)
    }

    val student = marty as Student      // upcast (or unsafe cast)
    val safeCast = jane as? StudentAthlete      // downcast (safe cast, down cast can return nullable)
}