package com.audiofile100._19_overriding

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

    val marty = StudentAthlete("Marty", "Gutenberg")

    val mathGrade = Grade(course = "Algebra", letter = 'F', credits = 3.0)
    marty.recordGrade(mathGrade)
    marty.recordGrade(mathGrade)
    marty.recordGrade(mathGrade)


}