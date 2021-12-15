package com.audiofile100._09_when

fun main() {
    // each case in when expression must be boolean or return a value (similar to if)
    // when cannot fall through - this allows smart casts
    val age = 23

    val message = when (age) {
        in 0..12 -> "Child"
        in 13..19 -> "Teenager"
        in 20..29 -> "In my twenties..."
        in 30..39 -> "In my thirties..."
        in 40..49 -> "In my forties..."
        else -> "I'm a wise man"
    }

    println(message)

    val email: String? = "mail@mail.com"
    val password: String? = "iLoveKotlin"

    when {
        email == null || email.isEmpty() -> println("Please enter your email")      // email gets smart cast for all the cases and checks
        "@" !in email -> println("Invalid email format")
        password == null || password.isEmpty() -> println("Please enter your password")
        password.length < 10 -> println("Password not strong enough")
        else -> println("Email length: ${email.length}, Password length: ${password.length}")
    }
}