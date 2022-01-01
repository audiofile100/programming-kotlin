package com.audiofile100._17_extension_properties

import kotlin.math.PI

class Circle(var radius: Double = 0.0) {
    val circumference: Double
        get() = PI * radius * 2

    companion object {
        val description = "circle"
    }
}

val Circle.diameter: Double
    get() = 2.0 * radius

fun Circle.myExtraMethod() {
    println("Extension Method Called.")
}

// you can extend companion objects as well
fun Circle.Companion.describeSelf(circle: Circle) {
    println("Circle with circumference: ${circle.circumference}")
    println("Diameter: ${circle.diameter}")
}

fun main() {
    // extension properties and methods allows you to add
    // functionality without altering the original class definition
    // use case: using third party software and you need extra functionality

    val unitCircle = Circle(1.0)
    println("diameter: ${unitCircle.diameter}")

    unitCircle.myExtraMethod()

    Circle.describeSelf(unitCircle)
}