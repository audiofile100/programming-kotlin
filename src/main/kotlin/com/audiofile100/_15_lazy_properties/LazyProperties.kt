package com.audiofile100._15_lazy_properties

import kotlin.math.atan
import kotlin.properties.Delegates

class Lamp {
    lateinit var bulb: LightBulb
}

class LightBulb {
    companion object {
        const val maxCurrent = 40
    }
    var current by Delegates.vetoable(0) {
            _, _, new ->
        if (new > maxCurrent) {
            println("Current too high, falling back to previous value.")
            false
        } else {
            true
        }
    }
}

// calculation is postponed until you access the property
class Circle(var radius: Double = 0.0) {
    val pi: Double by lazy { ((4.0 * atan(1.0 / 5.0)) - atan(1.0 / 239.0)) * 4.0 }
    val circumference: Double
        get() = pi * radius * 2
}

fun main() {
    // if you have a property that takes long to calculate and
    // you don't want to slow things down.
    // Lazy properties will let you perform calculation when needed.

    val circle = Circle(5.0)    // pi calculation is not run yet

    // now pi is calculated only once. Also note: we can use val
    println(circle.circumference)

    // notes -> pi doesn't change so we want to calculate it once!

    // -------- what if you need to denote that a property will not have a value when the instance is created?
    // -------- use lateinit var

    val fancyLamp = Lamp()
    //println(fancyLamp.bulb)         // exception: lateinit property has not been initialized

    val light = LightBulb()
    light.current = 40
    fancyLamp.bulb = light
    println(fancyLamp.bulb.current)
}