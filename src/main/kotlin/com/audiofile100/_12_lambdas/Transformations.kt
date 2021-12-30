package com.audiofile100._12_lambdas

fun main() {
    // 1. Group by which names come before or after M
    // 2. Sort by name length
    // 3. No dwarves with names less than four letters long
    // 4. Turn dwarves before M into a map, group by the first letters in their names

    val dwarves = listOf(
        listOf("Sleepy", "Grumpy", "Doc", "Bashful", "Sneezy"),
        listOf("Thorin", "Nori", "Bombur")
    )

    // flat map to flatten the lists into one

    val (beforeM, afterM) = dwarves.flatMap { dwarveList ->
        dwarveList.filter { it.length > 3 }
    }.sortedBy { -it.length }.partition { it < "M" }

    val groupBeforeM = beforeM.groupBy { it.first() }

    println(groupBeforeM)
    println(afterM)
}