package com.audiofile100._06_collections

fun main() {
    val games = mutableMapOf<String, MutableList<String>>()

    games.put("Role Playing", mutableListOf("Persona 5", "Final Fantasy VII Remake"))
    println(games)

    val rpgs = games["Role Playing"]
    println(rpgs)

    val action = games["Action"]
    println(action)     // null

    // immutable map
    val headers = mapOf(
        "API_KEY" to "your-api-key",
        "Authorization" to "auth token",
        "content/type" to "application/json"
    )
    println(headers)

    // --- more with maps
    games["Racing"] = mutableListOf("Gran Turismo", "Need for Speed")
    games["Strategy"] = mutableListOf()
    println(games)

    games["Strategy"]?.add("Civilisation VI")   // safe call because get function returns nullable
    println(games)

    val removed = games.remove("Strategy")
    println(removed)
    println(games)

    // There are layers of mutability
    // 1. Reference
    // 2. Internal
    // 3. Content

    // --- Iteration
    for (key in games.keys) {   // or val in games.values
        println(key)
    }

    for ((k, v) in games) {     // inline destructuring
        println("Key: $k, Value: $v")
    }
}