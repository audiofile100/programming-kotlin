package com.audiofile100._04_nullables

fun main() {
    val name = "Filip"
    val nickname: String? = null

    println(nickname)

    // avoid forcing
    //val len = nickname!!.length     // NPE

    // use safe calls
    val len = nickname?.length      // null
    println(len)

    // use elvis operator to provide default values (or return)
    val len2 = nickname ?: 0
    println(len2)
}