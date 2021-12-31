package com.audiofile100._16_methods

val months = arrayOf(
    "January", "February", "March",
    "April", "May", "June", "July",
    "August", "September", "October",
    "November", "December"
)

class SimpleDate(var month: String) {

    fun monthsUntilChristmas(): Int {
        return months.indexOf("December") - months.indexOf(month)
    }
}

fun main() {

    val date = SimpleDate("October")
    println(date.monthsUntilChristmas())
}