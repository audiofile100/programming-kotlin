package com.audiofile100._06_collections

fun main() {
    // List size is dynamic (add & remove)
    // accessing elements O(1)
    // iterating elements O(n)
    // removing element O(n) because we shift elements
    // adding element O(1) because we append to the end

    val states = listOf("California", "Utah", "Nevada", "New York")     // contents are immutable

    println(states)

    val mutableStates = mutableListOf("California", "Utah", "Nevada", "New York")
    //val mutableStates = states.toMutableList()
    mutableStates.add("Idaho")
    mutableStates.add(3, "Colorado")        // O(n) due to shifting

    println(mutableStates)

    println("Is Texas in mutableStates? " + ("Texas" in mutableStates))

    println("Removing state Utah: " + mutableStates.remove("Utah"))
    println(mutableStates)
}