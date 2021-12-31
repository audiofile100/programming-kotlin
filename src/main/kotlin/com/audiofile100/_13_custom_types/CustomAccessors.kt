package com.audiofile100._13_custom_types

import kotlin.math.roundToInt
import kotlin.math.sqrt

class Person(val firstName: String, val lastName: String) {
    val fullName = "$firstName $lastName"
}

class TV(var width: Double, var height: Double) {
    var diagonal: Int
        get() {
            val res = sqrt(width * width + height * height)
            return res.roundToInt()
        }
        set(value) {
            val ratioWidth = 16.0
            val ratioHeight = 9.0
            val ratioDiag = sqrt(ratioWidth * ratioWidth + ratioHeight * ratioHeight)
            height = value.toDouble() * ratioHeight / ratioDiag
            width = height * ratioWidth / ratioHeight
        }
}

fun main() {

    val grace = Person("Grace", "Hopper")
    println(grace.fullName)

    val tv = TV(width = 95.87, height = 53.93)
    println(tv.diagonal)

    tv.diagonal = 65
    println("That'll be ${tv.width} inches wide")
}