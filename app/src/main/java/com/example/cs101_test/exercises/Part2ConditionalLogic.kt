package com.example.cs101_test.exercises

object Part2ConditionalLogic {
    // ---------------------- EXERCISE 1
    // Create a function that takes an integer as a parameter and returns "Positive", "Negative", or "Zero".
    fun checkNumber(number: Int): String {
        // Your code here
        return when {
            number > 0 -> "Positive"
            number < 0 -> "Negative"
            else -> "Zero"

        }
    }

    // ---------------------- EXERCISE 2
    // Create a function that takes a string and prints each character on a new line.
    fun printChars(input: String) {
        // Your code here
        input.forEach { char ->
            println(char)
        }
    }

    // ---------------------- EXERCISE 3
    // Create a function that takes an integer and returns the sum of its digits.
    // For example if input is 45 then output should be 9 (4+5)
    fun sumDigits(number: Int): Int {
        // Your code here
        val list = mutableListOf<Int>()
        number.toString().map { list.add(it.digitToInt()) }

        return list.sum()
    }

    // ---------------------- EXERCISE 4
    // Create a function that takes a list of integers and returns a new list with only the odd numbers.
    // For example if input is (1,2,3,4,5) then output should be (1,3,5)
    fun filterOddNumbers(numbers: List<Int>): List<Int> {
        // Your code here
        return numbers.filter { it % 2 != 0 }
    }

    // ---------------------- EXERCISE 5
    // Create a function that takes a list of strings and returns a new list with all strings in lowercase.
    fun transformToLowercase(strings: List<String>): List<String> {
        // Your code here
        return strings.map { it.lowercase() }
    }

    // ---------------------- EXERCISE 6
    // Create a function that prints numbers from 1 to 10 with println(), but skips multiples of 3 using a loop.
    // Expected output: "1", "2", "4", "5", "7", "8", "10"
    fun printNumbersSkipMultiplesOf3() {
        // Your code here
        for (i in 1..10) {
            if (i % 3 != 0) {
                println(i)
            }
        }
    }

    // ---------------------- EXERCISE 7
    // Create a function that takes a string and returns true if it is a palindrome, false otherwise.
    // Palindrome: a word, phrase, or sequence that reads the same backwards as forwards, e.g. "madam" or "nurses run".
    // White spaces should be ignored.
    fun isPalindrome(input: String): Boolean {
        // Your code here
        val cleaned: String = input.replace(" ","")
        val reversed: String = cleaned.reversed()

        return cleaned == reversed

    }

    // ---------------------- EXERCISE 8
    // Modify the function to have default values for both width and height and to return the area of the rectangle.
    // Example of a function with a default value "world": fun greet(name: String = "world") {}
    fun calculateArea(width: Int = 5, height: Int = 5): Int {
        // Your code here
        return width * height
    }

    // ---------------------- EXERCISE 9
    // Create a function that takes a day of the week as a string and returns "Weekday" or "Weekend".
    // Make sure it handles both uppercase and lowercase letters.
    // Acceptable days: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    // If the day does not exist, return "Invalid day".
    fun dayType(day: String): String {
        val day = day.lowercase()
        val weekend: List<String> = listOf("saturday", "sunday")
        val weekday: List<String> = listOf(
            "monday", "tuesday", "wednesday", "thursday", "friday"
        )

        return when (day) {
            in weekday -> {
                "Weekday"
            }
            in weekend -> {
                "Weekend"
            }
            else -> {
                "Invalid day"
            }
        }
    }

    // ---------------------- EXERCISE 10
    // Create a function that takes an integer year and returns true if it is a leap year, false otherwise.
    // Leap year requirements:
    //      Dividing the year by 4 must result in a whole number with no remainder (no decimals)
    //      If dividing the year by 100 result in a whole number, it must also result in a whole number when dividing by 400
    // Examples: 2024 is a leap year, and 2023 is not
    fun isLeapYear(year: Int): Boolean {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)
    }

    // ---------------------- EXERCISE 11
    // Create a function that takes a list of integers and a lambda function, and returns
    // a new list with the results of applying the lambda to each element.
    // Example:
    //      val numbers = listOf(1, 2, 3, 4, 5)
    //      val result = applyLambda(numbers) { it * 2 }
    //      Should return: [2, 4, 6, 8, 10]
    fun applyLambda(numbers: List<Int>, lambda: (Int) -> Int): List<Int> {
        val newList: MutableList<Int> = mutableListOf()
        numbers.forEach { newList.add(lambda(it)) }
        return newList
    }
}
