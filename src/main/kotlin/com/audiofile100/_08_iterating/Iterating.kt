package com.audiofile100._08_iterating

fun main() {
    val daysOfWeek = listOf(
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    )

    for (day in daysOfWeek) {
        if (day == "Monday") {
            continue
        }
        println("$day: Working")

        if (day == "Thursday") {
            println("$day: Prepare for the weekend")
            break
        }
    }

    val matrix = MutableList<MutableList<String>>(5) { MutableList(5) { "" } }

    for (row in 0..matrix.lastIndex) {
        for (col in 0..matrix.lastIndex) {
            matrix[row][col] = "$row:$col"
        }
    }

    println(matrix)
    println("-------")

    for (row in matrix) {
        println(row)
    }

    outer@ for (row in 0..5) {
        inner@ for (col in 0..5) {
            if (row == 2 && col == 2) {
                break@inner     //@row
            }
            print("x\t")
        }
        println()
    }
}