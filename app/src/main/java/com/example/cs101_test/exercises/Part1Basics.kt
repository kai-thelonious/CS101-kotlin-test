package com.example.cs101_test.exercises

object Part1Basics {
    // ---------------------- EXERCISE 1
    // Declare a mutable variable called 'temperature' of type Int and assign it a value of 25.
    var temperature: Int = 25

    // ---------------------- EXERCISE 2
    // Declare an immutable variable called 'greeting' of type String and assign it a value of "Hello, Kotlin!".

    val greeting: String = "Hello, Kotlin!"

    // ---------------------- EXERCISE 3
    // Print on separate lines the variables from exercise 1 and 2.
    fun printVariables() {
        // Your code here
        println(temperature)
        println(greeting)
    }

    // ---------------------- EXERCISE 4
    // Complete the function to convert a string to uppercase and return it.
    fun convertToUpperCase(input: String): String {
        // Your code here
        return input.uppercase()
    }

    // ---------------------- EXERCISE 5
    // Write a function to check if a number is even or odd and return true if even and false if odd.
    fun isEven(number: Int): Boolean {
        // Your code here
        return number % 2 == 0
    }

    // ---------------------- EXERCISE 6
    // Create a function to find the second largest number in a list.
    fun secondLargest(list: List<Int>): Int {
        // Your code here
        val sorted: List<Int> = list.sorted()
        return sorted[sorted.size-2]
    }



    // ---------------------- EXERCISE 7
    // Create a function that takes a name as a parameter and returns "Hello, <name>!".
    fun greetUser(name: String): String {
        // Your code here
        return "Hello, $name!"
    }

    // ---------------------- EXERCISE 8
    // Create a function to find the maximum value in a list.
    fun findMax(numbers: List<Int>): Int {
        // Your code here
        val max: Int = numbers.maxOrNull() ?: 0
        return max
    }

    // ---------------------- EXERCISE 9
    // Create a function to get the value for a given key from a map.
    fun getValue(map: Map<String, Int>, key: String): Int? {
        // Your code here
        return null
    }

    // ---------------------- EXERCISE 10
    // Create a function that calculates the area of a rectangle given its length and width.
    fun calculateArea(length: Double, width: Double): Double {
        // Your code here
        return 0.0
    }

    // ---------------------- EXERCISE 11
    // Create a function that checks if a number is positive and returns a boolean. 0 is not positive.
    fun isPositive(number: Int): Boolean {
        // Your code here
        return false
    }

    // ---------------------- EXERCISE 12
    // Create a function to calculate the average of an array of doubles.
    fun calculateAverage(numbers: Array<Double>): Double {
        // Your code here
        return 0.0
    }

    // ---------------------- EXERCISE 13
    // Create a function that filters out negative numbers from a list.
    fun filterNegativeNumbers(numbers: List<Int>): List<Int> {
        // Your code here
        return listOf()
    }

    // ---------------------- EXERCISE 14
    // Create a function that returns a map of characters to their frequency in a string.
    // Ignore numbers, punctuation and all that is not a character A-Z or a-z.
    // Example:
    //      Input: "hello, world"
    //      Expected Output: {h=1, e=1, l=3, o=2, w=1, r=1, d=1}
    fun charFrequency(str: String): Map<Char, Int> {
        // Your code here
        return mapOf()
    }
}
