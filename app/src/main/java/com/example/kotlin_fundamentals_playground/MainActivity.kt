package com.example.kotlin_fundamentals_playground

fun main() {
    // TYPES
    // var name = "Kotlin" // mutable
    val myName = "Jordan" // immutable

    // WHOLE NUMBERS
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

    // DECIMAL / FLOATING POINT NUMBERS

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

    // LOOPS AND BRANCHING
    val amount = 100

    // "if" statement
    if (amount >= 1000) {
        println("Wow... you are very wealthy")
    } else {
        println("You are getting by")
    }

    // "When" expression
    when (amount) {
        in 1..100 -> println("Between 1 and 100")
        !in 10..90 -> println("Outside the range")
        999 -> println("Really close")
        1000 -> println("You made it!")
        else -> {
            println("$amount is the amount")
        }
    }

    // "For" Loop
    for (i in 1..1000) {
        if (i % 113 == 0) {
            println("$i is a multiple of 113")
        }
    }

    sayHi()
    calculate(multipleOf = 3)
    val catAge = inCatYears(7)
    val abbreviatedCatAge = abbreviatedCatYears(12)
    println("This cat is $catAge years old")
    println("This other cat is $abbreviatedCatAge years old")
    println(sum(1, 4))
    println(add(4, 6))
    println(calcCatAge(10))
    showName("Hello Kotlin!")
    // Trailing Lambda
    enhancedMessage(message = "Hello there,") {
        add(12, 12)
    }

    // COLLECTIONS
    // Immutable lists
    val myListOfNames = listOf("James", "Paul", "Rafael", "Gina")

    // Looping through lists with For..In loops
    for (item in myListOfNames) {
        println(item)
    }

    // Looping using for...each loops
    myListOfNames.forEach {
        println(it)
    }

    // COLLECTIONS: LISTS
    // Mutable lists
    val myMutableList = mutableListOf(12, 24, 45, 123)
    myMutableList.add(214)
    myMutableList.removeAt(0)

    // Invoking Methods on Lists
    // size
    println("Number of elements: ${myMutableList.size}")
    // get element
    println("Second element: ${myMutableList.get(1)}")
    // get index
    println("Index of element \"45\": ${myMutableList.indexOf(45)}")

    // COLLECTIONS: SETS
    // A set is a collection of unique elements. Order does not matter.
    val mySet = setOf("US", "MZ", "AU") // immutable by default
    val myMutableSet = mutableSetOf(1, 2, 3, 4, 5)
    myMutableSet.add(34)
    // if I try to add "3" to myMutableSet, nothing will happen
    // because you can only add UNIQUE values to a set
    println(myMutableSet)

    // COLLECTIONS: MAPS
    // 👇 immutable by default
    val secretMap = mapOf("Up" to 1, "Down" to 2, "Left" to 3, "Right" to 4)
    println(secretMap)
    // methods
    println(secretMap.values)
    // conditional logic
    // check to see if the key "Up" is contained
    if ("Up" in secretMap) println("Yes is in!")

    // 👇 create a mutable map
    val myMutableSecretMap = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)
    // add to a mutable map
    myMutableSecretMap["Four"] = 4
    println(myMutableSecretMap)

    // Initializing Lists
    // if we want to explicitly initialize a list, we can do this...
    val myNewList = mutableListOf<String>()
    myNewList.add("hey")
    for (i in 1..10) {
        myNewList.add(i, "\"Hey there, $i\"")
    }
    println(myNewList)

    // Empty Collections
    // Whenever you create an empty list, you need to set the type
    val empty = emptyList<String>()
    val emptySet = emptySet<Int>()
    // With maps, you must type the key and value
    val emptyMap = emptyMap<String, Int>()

    // COLLECTIONS: Filters
    // Note: Filter is CASE SENSITIVE by default, but you can pass
    // an ignoreCase boolean to change that
    val found = myListOfNames.filter {
        it == "Paul" || it.length > 4
    }
    val endsWithL = myListOfNames.filter {
        it.endsWith("l")
    }
    println(found)
    println(endsWithL)

    // NOTE: strings in Kotlin are defined by "" and chars are
    // defined by ''

    var car = Car(color = "Green", model = "LLm")
    println("Car color: ${car.color} model: ${car.model}")
    car.drive()
}

// FUNCTIONS
fun sayHi() {
    println("This is a function.")
}

// FUNCTIONS WITH INT PARAMETERS
fun calculate(
    first: Int = 2, second: Int = 100, message: String = "is a multiple of", multipleOf: Int = 13
) {
    for (i in first..second) {
        if (i % multipleOf == 0) {
            println("$i $message $multipleOf")
        }
    }
}

// Return Types
fun inCatYears(age: Int): Int {
    return age * 7
}

// Abbreviated Function Syntax
fun abbreviatedCatYears(age: Int): Int = age * 7

// Lambda Functions
fun sum(a: Int, b: Int): Int {
    return a + b
}

// rewritten as a lambda function...
val add: (Int, Int) -> Int = { a, b -> a + b }

// using the Lambda "It" Keyword
val calcCatAge: (Int) -> Int = { it * 7 }

// Lambda Expressions that Return Unit - Void
// Unit is a type meaning return value of void
val showName: (String) -> Unit = { println(it) }

//  TRAILING LAMBDA FUNCTIONS
//  If the last argument in a Kotlin function is a lambda function, you can
//  pass in that lambda function to the parent function and invoke it
fun enhancedMessage(message: String, funAsParameter: () -> Int) {
    println("$message ${funAsParameter()}")
}

class Car(var color: String = "Blue", var model: String = "xmdle") {
    fun drive() {
        println("Drive...vroooommm")
    }
}