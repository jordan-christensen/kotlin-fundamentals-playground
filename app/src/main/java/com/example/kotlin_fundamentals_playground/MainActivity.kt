package com.example.kotlin_fundamentals_playground

fun main() {
    // TYPES
    // var name = "Kotlin" // mutable
    val myName = "Jordan" // immutable

    // Integer
    val age: Int = 145

    // Byte
    val byteUpperLimit: Byte = 127
    val byteLowerLimit: Byte = -128

    // Short
    val myShort: Short = 12999

    // Long - 64 bit data type
    val number = 1 // This will be an integer
    val numberLong = 1L // This will be a long
    val numberExplicitlyLong: Long = 1 // This will be a long

    println("Hello, my name is $myName. I'm $age years old. $byteUpperLimit, $byteLowerLimit, $myShort")
    println("Integer: $number, Long: $numberLong, ExplicitLong: $numberExplicitlyLong")

    // Floating Point Type Numbers

    // Float - Holds 32 bits
    val piFloat = 3.14f
    // in Kotlin, you can type a decimal number as a float with
    // either a lower case "f" or an uppercase "F"

    // Double - Holds 64 bits
    val piDouble = 3.14
    // or val piDouble = 3.14D

    // decimal numbers that aren't specified as a float or double
    // will default to being a double

    // Difference between float and double
    val e = 2.7182818284
    val eFloat = 2.7182818284f
    // in the console, the float loses a few decimal places

    println("This float: $piFloat, this double: $piDouble")
    println("This float: $e, this double: $eFloat")

    // OPERATORS
    val a = 23
    val b = 12
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)

    // Note: Dividing 23 (int) by 12 (int) results in 1 (int).
    // This isn't mathematically precise and it occurs because we
    // divided two ints. If even ONE of them were a double we would
    // get the result 1.9166666667--much more mathematically precise.

    // Modulo Operator
    val modA = 10
    val modB = 2
    val modC = 3
    // The modulo operator (%) divides one number by another number
    // and returns the remainder or "modulus"
    // so...
    println("Modulus, Example 1: " + modA % modB)
    // ...should return 0
    // whereas...
    println("Modulus, Example 2: " + modA % modC)
    // ...should return 1


}
