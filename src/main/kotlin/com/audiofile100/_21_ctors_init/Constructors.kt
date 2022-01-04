package com.audiofile100._21_ctors_init

data class Grade(val course: String, val letter: Char, val credits: Double)

open class Student(var firstName: String, var lastName: String,
                   var grades: MutableList<Grade> = mutableListOf<Grade>()) {
    open fun recordGrade(grade: Grade) {
        grades.add(grade)
    }
}

class BandMember(firstName: String, lastName: String): Student(firstName, lastName) {
    var minPracticeTime: Int = 2
    val isEligible
        get() = grades.none { it.letter == 'F' }

    constructor(firstName: String, lastName: String, minPracticeTime: Int): this(firstName, lastName) {
        this.minPracticeTime = minPracticeTime
    }

    init {                                      // init block runs just after primary ctor
        if (!isEligible) minPracticeTime +=1
    }
}

fun main() {

    val bill = BandMember(firstName = "Bill", lastName = "S. Preston, Esq.")
    val ted = BandMember(firstName = "Ted", lastName = "Theodore Logan", minPracticeTime = 7)
}