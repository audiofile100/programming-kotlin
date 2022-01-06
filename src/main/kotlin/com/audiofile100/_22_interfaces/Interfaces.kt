package com.audiofile100._22_interfaces

interface Vehicle {
    fun accelerate()
    fun stop()
}

class Car: Vehicle {
    override fun accelerate() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }

}

enum class Direction {
    LEFT, RIGHT
}

interface TurningVehicle: Vehicle {
    fun turn(direction: Direction = Direction.RIGHT)
    fun description(): String
}

interface SpaceVehicle: Vehicle {
    val tribblesCount: Int
    val name: String
        get() = "SpaceVehicle"
    override fun accelerate() {
        println("Proceed to Hyperspace!")
    }

    override fun stop() {
        println("Whoa slow down!")
    }
}

class LightFreighter: SpaceVehicle {
    override val tribblesCount: Int = 0
    var hyperdriveBusted: Boolean = false
    override fun stop() {
        hyperdriveBusted = true
        println("Hyperdrive failed!")
    }
}

fun main() {

    val falcon = LightFreighter()
    falcon.accelerate()
    falcon.stop()
}