package com.audiofile100._25_sealed_class

/*
A sealed class has a limited number of subclasses, all defined in the same file.
Sealed classes are abstract.
Subclasses must be in the same file. This avoids massive inheritance trees.
Constructors are always private.
 */

sealed class AcceptedCurrency {
    abstract val valueInDollars: Float
    var amount: Float = 0.0f

    class Dollar: AcceptedCurrency() {
        override val valueInDollars = 1.0f
    }
    class Euro: AcceptedCurrency() {
        override val valueInDollars = 1.25f
    }
    class Crypto: AcceptedCurrency() {
        override val valueInDollars = 2534.92f
    }

    val name: String
        get() = when (this) {
            is Euro -> "Euro"
            is Dollar -> "Dollar"
            is Crypto -> "Crypto"
        }

    fun totalValueInDollars(): Float {
        return amount * valueInDollars
    }
}

fun main() {

    val currency = AcceptedCurrency.Crypto()
    println("You got some ${currency.name}")

    currency.amount = .27541f
    println("${currency.amount} of ${currency.name} is ${currency.totalValueInDollars()} in dollars")
}