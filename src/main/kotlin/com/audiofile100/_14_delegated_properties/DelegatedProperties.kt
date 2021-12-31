package com.audiofile100._14_delegated_properties

import com.audiofile100._13_custom_types.Level
import kotlin.properties.Delegates

class Level(val id: Int, val boss: String) {
    companion object {
        var highestLevel = 0
    }
    var unlocked: Boolean by Delegates.observable(false) {
        _, old, new ->
        if (new && id > highestLevel) {
            highestLevel = id
        }
    }
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

fun main() {
    // 1. How to automatically increase the highestLevel?
    // 2. Use delegated property observable
    // 3. Delegated properties are not the same as getters and setters

    val level1 = Level(id = 1, boss = "Outside Cat", unlocked = true)
    val level2 = Level(id = 2, boss = "Laser Pointer", unlocked = false)
    val level3 = Level(id = 3, boss = "Mysterious Attic Sound", unlocked = false)
    val level4 = Level(id = 4, boss = "Vacuum Cleaner", unlocked = false)

    println("Highest level is ${Level.highestLevel}")

    level4.unlocked = true
    println("Highest level is ${Level.highestLevel}")

    // 4. Using Delegates.vetoable() to limit a value

    val light = LightBulb()
    light.current = 100
    println(light.current)

    light.current = 40
    println(light.current)
}