package com.audiofile100._13_custom_types

// what if you want to store the highest level reached?

class Level(val id: Int, val boss: String, var unlocked: Boolean) {
    companion object {
        var highestLevel = 1
        fun myCompanionMethod() {
            println("Called companion method.")
        }
    }
}

fun main() {
    // companion objects are similar to static properties in that they are shared across all instances

    val level1 = Level(id = 1, boss = "Outside Cat", unlocked = true)
    val level2 = Level(id = 2, boss = "Laser Pointer", unlocked = false)
    val level3 = Level(id = 3, boss = "Mysterious Attic Sound", unlocked = false)
    val level4 = Level(id = 4, boss = "Vacuum Cleaner", unlocked = false)

    // access companion object via class itself
    println("Highest level is ${Level.highestLevel}")

    Level.myCompanionMethod()
}