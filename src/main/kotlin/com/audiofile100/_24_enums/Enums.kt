package com.audiofile100._24_enums

// when you have a set of known values

enum class DaysOfWeek(val isWeekend: Boolean = false) {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY(true),
    SUNDAY(true);

    fun daysUntil(other: DaysOfWeek): Int {
        if (this.ordinal < other.ordinal) {
            return other.ordinal - this.ordinal
        } else {
            return other.ordinal - this.ordinal + DaysOfWeek.values().count()
        }
    }
}

fun main() {

    for (day in DaysOfWeek.values()) {
        println("Day ${day.ordinal}: ${day.name}, isWeekend: ${day.isWeekend}")
    }

    val friday = DaysOfWeek.FRIDAY
    println(DaysOfWeek.WEDNESDAY.daysUntil(friday))

    val today = DaysOfWeek.WEDNESDAY

    when (today) {
        DaysOfWeek.MONDAY -> println("Today is monday")
        DaysOfWeek.TUESDAY -> println("Today is tuesday")
        DaysOfWeek.WEDNESDAY -> println("Today is wednesday")
        DaysOfWeek.THURSDAY -> println("Today is thursday")
        DaysOfWeek.FRIDAY -> println("Today is friday")
        DaysOfWeek.SATURDAY -> println("Today is saturday")
        DaysOfWeek.SUNDAY -> println("Today is sunday")
    }
}