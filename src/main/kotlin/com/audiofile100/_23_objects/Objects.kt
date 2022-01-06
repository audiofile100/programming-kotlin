package com.audiofile100._23_objects

// object is a keyword and represents a single instance, a named object.
// It has no constructors.
// Properties must be initialized before use (init at declaration or init block)
// It can inherit from classes and implement interfaces.
// We can use this built in way for Singletons.

data class Student(val id: Int, val firstName: String, val lastName: String) {
    var fullName = "$lastName, $firstName"
}

// A Singleton
object Registry {
    val allStudents = mutableListOf<Student>()

    fun addStudent(student: Student) {
        allStudents.add(student)
    }

    fun removeStudent(student: Student) {
        allStudents.remove(student)
    }

    fun listAll() {
        allStudents.forEach { println(it.fullName) }
    }
}

fun main() {

    val francisco = Student(1, "Francisco", "Goya")
    val sally = Student(2, "Sally", "Smith")
    val frida = Student(3, "Frida", "Kahlo")

    // Using Singleton, we ensure there is only one instance
    Registry.addStudent(francisco)
    Registry.addStudent(sally)
    Registry.addStudent(frida)
}