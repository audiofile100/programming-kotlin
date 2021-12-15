package com.audiofile100._06_collections

fun main() {
    val ids = setOf(1, 2, 3, 4)

    // unlike other collections - you cannot fetch data
    // sets are mainly used to store values and process them in loops

    println(ids.contains(6))
    println(2 in ids)

    val mutableIds = ids.toMutableSet()

    mutableIds.add(5)
    mutableIds.add(6)

    println(6 in mutableIds)

    val removed = mutableIds.remove(6)

    println(6 in mutableIds)

    for (mids in mutableIds) {
        println(mids)
    }

    // what happens if you transform a collection with duplicate values to a set?
    val names = arrayOf("Andrew", "Ben", "Cindy", "Danny", "Cindy")

    val res = names.toMutableSet()

    for (name in res) {
        println(name)
    }
}