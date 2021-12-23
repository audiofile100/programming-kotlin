package com.audiofile100._10_functions

fun main() {
    val email: String? = "email@email.com"
    val password: String? = "password"

    fun validateString(input: String?, inputType: String) =
        if (input == null || input.isBlank()) {
            false
        } else if (inputType == "Password") {
            input.length >= 10
        } else if (inputType == "Email") {
            input.contains("@")
        } else {
            println("Cannot verify this input")
            false
        }

    validateString("Hello World", "Welcome message")

    val isValidEmail = validateString(email, "Email")
    println(isValidEmail)

    fun validateString(input: String?, validator: (String) -> Boolean) =
        if (input == null || input.isBlank()) {
            false
        } else {
            validator(input)
        }

    val isValidPassword = validateString(password) { input -> input.length >= 10 }      // trailing lambdas
    println(isValidPassword)

    // another way to pass lambda
    fun validatePassword(password: String) = password.length >= 10

    val isValidPassword2 = validateString(password, ::validatePassword)     // function reference
    println(isValidPassword2)
}