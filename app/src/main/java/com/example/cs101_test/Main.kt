package com.example.cs101_test

import com.example.cs101_test.exercises.Part1Basics
import com.example.cs101_test.exercises.Part2ConditionalLogic
import com.example.cs101_test.exercises.Part3ClassesAndObjects
import com.example.cs101_test.exercises.Part4InheritanceAndAccessModification
import com.example.cs101_test.exercises.Part5InterfacesAndAbstractClasses

fun main() {
    println("Welcome to the Kotlin exercises!")

    // Uncomment and complete the exercises as specified.
    // Some exercises you might have to check yourself if you want to check the solution.

    println("\n--------------------------------------")
    println("Part 1 Basics")
    // ---------------------- EXERCISE 1
    // No check here for this exercise. If you want to test it, run Part1Tests.

    // ---------------------- EXERCISE 2
    // No check here for this exercise. If you want to test it, run Part1Tests.

    // ---------------------- EXERCISE 3
    println("Exercise 3: Print the variables 'temperature' and 'greeting'.")
    // Part1Basics.printVariables()
    // println("Expected output: e.g., 25 and 'Hello, Kotlin!'")

    // ---------------------- EXERCISE 4
    println("Exercise 4: Complete the function to convert a string to uppercase and return it.")
    // println(Part1Basics.convertToUpperCase("kotlin"))
    // println("Expected output: KOTLIN")

    // ---------------------- EXERCISE 5
    println("Exercise 5: Write a function to check if a number is even or odd and return true if even and false if odd.")
    println(Part1Basics.isEven(2))
    println("Expected output: true")
    println(Part1Basics.isEven(3))
    println("Expected output: false")

    // ---------------------- EXERCISE 6
    println("Exercise 6: Create a function to find the second largest number in a list.")
    println(Part1Basics.secondLargest(listOf(1, 2, 3, 4, 5)))
    println("Expected output: 4")

    // ---------------------- EXERCISE 7
    println("Exercise 7: Create a function that takes a name as a parameter and returns 'Hello, <name>!'.")
    // println(Part1Basics.greetUser("Alice"))
    // println("Expected output: Hello, Alice!")

    // ---------------------- EXERCISE 8
    println("Exercise 8: Create a function to find the maximum value in a list.")
    // println(Part1Basics.findMax(listOf(1, 2, 3, 4, 5)))
    // println("Expected output: 5")

    // ---------------------- EXERCISE 9
    println("Exercise 9: Create a function to get the value for a given key from a map.")
    // println(Part1Basics.getValue(mapOf("a" to 1, "b" to 2, "c" to 3), "b"))
    // println("Expected output: 2")

    // ---------------------- EXERCISE 10
    println("Exercise 10: Create a function that calculates the area of a rectangle given its length and width.")
    // println(Part1Basics.calculateArea(5.0, 10.0))
    // println("Expected output: 50.0")

    // ---------------------- EXERCISE 11
    println("Exercise 11: Create a function that checks if a number is positive and returns a boolean.")
    // println(Part1Basics.isPositive(10))
    // println("Expected output: true")
    // println(Part1Basics.isPositive(-10))
    // println("Expected output: false")
    // println(Part1Basics.isPositive(0))
    // println("Expected output: false")

    // ---------------------- EXERCISE 12
    println("Exercise 12: Create a function to calculate the average of an array of doubles.")
    // println(Part1Basics.calculateAverage(arrayOf(1.0, 2.0, 3.0, 4.0, 5.0)))
    // println("Expected output: 3.0")

    // ---------------------- EXERCISE 13
    println("Exercise 13: Create a function that filters out negative numbers from a list.")
    // println(Part1Basics.filterNegativeNumbers(listOf(1, -2, 3, -4, 5)))
    // println("Expected output: [1, 3, 5]")

    // ---------------------- EXERCISE 14
    println("Exercise 14: Create a function that returns a map of characters to their frequency in a string. Ignore numbers, punctuation, and all that is not a character A-Z or a-z.")
    // println(Part1Basics.charFrequency("hello, world"))
    // println("Expected output: {h=1, e=1, l=3, o=2, w=1, r=1, d=1}")


    println("\n--------------------------------------")
    println("Part 2 Conditional Logic")

    // ---------------------- EXERCISE 1
    println("Exercise 1: Create a function that takes an integer as a parameter and returns 'Positive', 'Negative', or 'Zero'.")
    // println(Part2ConditionalLogic.checkNumber(5))
    // println("Expected output: Positive")
    // println(Part2ConditionalLogic.checkNumber(-3))
    // println("Expected output: Negative")
    // println(Part2ConditionalLogic.checkNumber(0))
    // println("Expected output: Zero")

    // ---------------------- EXERCISE 2
    println("Exercise 2: Create a function that takes a string and prints each character on a new line.")
    // Part2ConditionalLogic.printChars("hello")
    // Expected output:
    // h
    // e
    // l
    // l
    // o

    // ---------------------- EXERCISE 3
    println("Exercise 3: Create a function that takes an integer and returns the sum of its digits.")
    // println(Part2ConditionalLogic.sumDigits(12345))
    // println("Expected output: 15")

    // ---------------------- EXERCISE 4
    println("Exercise 4: Create a function that takes a list of integers and returns a new list with only the odd numbers.")
    // println(Part2ConditionalLogic.filterOddNumbers(listOf(1, 2, 3, 4, 5)))
    // println("Expected output: [1, 3, 5]")

    // ---------------------- EXERCISE 5
    println("Exercise 5: Create a function that takes a list of strings and returns a new list with all strings in lowercase.")
    // println(Part2ConditionalLogic.transformToLowercase(listOf("Hello", "WORLD")))
    // println("Expected output: [hello, world]")

    // ---------------------- EXERCISE 6
    println("Exercise 6: Create a function that prints numbers from 1 to 10 with println(), but skips multiples of 3 using a loop.")
    // Part2ConditionalLogic.printNumbersSkipMultiplesOf3()
    // Expected output:
    // 1
    // 2
    // 4
    // 5
    // 7
    // 8
    // 10

    // ---------------------- EXERCISE 7
    println("Exercise 7: Create a function that takes a string and returns true if it is a palindrome, false otherwise.")
    // println(Part2ConditionalLogic.isPalindrome("nurses run"))
    // println("Expected output: true")
    // println(Part2ConditionalLogic.isPalindrome("hello"))
    // println("Expected output: false")

    // ---------------------- EXERCISE 8
    println("Exercise 8: Modify the function to have default values for both width and height and to return the area of the rectangle.")
    // println(Part2ConditionalLogic.calculateArea(5, 10))
    // println("Expected output: 50")
    // println(Part2ConditionalLogic.calculateArea(5))
    // println("Expected output: 50")
    // println(Part2ConditionalLogic.calculateArea(height = 10))
    // println("Expected output: 50")

    // ---------------------- EXERCISE 9
    println("Exercise 9: Create a function that takes a day of the week as a string and returns 'Weekday' or 'Weekend'.")
    // println(Part2ConditionalLogic.dayType("Monday"))
    // println("Expected output: Weekday")
    // println(Part2ConditionalLogic.dayType("Saturday"))
    // println("Expected output: Weekend")
    // println(Part2ConditionalLogic.dayType("Funday"))
    // println("Expected output: Invalid day")

    // ---------------------- EXERCISE 10
    println("Exercise 10: Create a function that takes an integer year and returns true if it is a leap year, false otherwise.")
    // println(Part2ConditionalLogic.isLeapYear(2024))
    // println("Expected output: true")
    // println(Part2ConditionalLogic.isLeapYear(2023))
    // println("Expected output: false")
    // println(Part2ConditionalLogic.isLeapYear(1900))
    // println("Expected output: false")
    // println(Part2ConditionalLogic.isLeapYear(2000))
    // println("Expected output: true")

    // ---------------------- EXERCISE 11
    println("Exercise 11: Create a function that takes a list of integers and a lambda function, and returns a new list with the results of applying the lambda to each element.")
    // println(Part2ConditionalLogic.applyLambda(listOf(1, 2, 3, 4, 5)) { it * 2 })
    // println("Expected output: [2, 4, 6, 8, 10]")


    println("\n--------------------------------------")
    println("Part 3 Classes and Objects")

    // ---------------------- EXERCISE 1
    println("Exercise 1: Create a Book class with title, author, and price. Add a displayDetails method.")
    // val book = Part3ClassesAndObjects.Book("CS101 testing", "Ane", 10.0)
    // book.displayDetails()
    // println("Expected output: CS101 testing, Ane, 10.0")

    // ---------------------- EXERCISE 2
    println("Exercise 2: Create a Student class with name, age, and grades. Add methods to addGrade, averageGrade, and displayDetails.")
    // val student = Part3ClassesAndObjects.Student("John Doe", 20)
    // student.addGrade(90)
    // student.addGrade(80)
    // student.addGrade(70)
    // println("Expected average grade: 80.0")
    // student.displayDetails()
    // println("Expected output: John Doe, 20, 80.0")

    // ---------------------- EXERCISE 3
    println("Exercise 3: Create a BankAccount class with accountNumber, balance, and accountHolder. Add methods to deposit, withdraw, and displayDetails. Ensure balance cannot be negative.")
    // val account = Part3ClassesAndObjects.BankAccount("12345", 1000.0, "Alice")
    // account.deposit(500.0)
    // println("Expected balance: 1500.0")
    // account.withdraw(200.0)
    // println("Expected balance: 1300.0")
    // account.withdraw(2000.0)
    // println("Expected balance after failed withdrawal: 1300.0")
    // account.displayDetails()
    // println("Expected output: 12345, 1300.0, Alice")

    // ---------------------- EXERCISE 4
    println("Exercise 4: Create a Product class with name and price. Create a Shop class with a list of products. Add methods to addProduct, removeProduct, listProducts, totalValue, and filterProducts.")
    // val product1 = Part3ClassesAndObjects.Product("Product1", 20.0)
    // val product2 = Part3ClassesAndObjects.Product("Product2", 30.0)
    // val product3 = Part3ClassesAndObjects.Product("Product3", 40.0)
    // val shop = Part3ClassesAndObjects.Shop()
    // shop.addProduct(product1)
    // shop.addProduct(product2)
    // shop.addProduct(product3)
    // shop.listProducts()
    // println("Expected output: Product1, 20.0, Product2, 30.0, Product3, 40.0")
    // shop.removeProduct(product2)
    // shop.listProducts()
    // println("Expected output after removal: Product1, 20.0, Product3, 40.0")
    // println("Expected total value: 60.0")
    // val filteredProducts = shop.filterProducts(25.0)
    // println("Expected filtered products: Product3, 40.0")


    println("\n--------------------------------------")
    println("Part 4 Inheritance and Access Modification")

    // ---------------------- EXERCISE 1
    println("Exercise 1: Create a base/open class called Appliance with brand, powerConsumption, and isOn. Add methods to turn on/off, and override toString.")
    // val washingMachine = Part4InheritanceAndAccessModification.WashingMachine("LG", 2000)
    // washingMachine.turnOn()
    // println("Expected isOn: true")
    // println(washingMachine)
    // washingMachine.showFeatures() // Expected: WashingMachine: has a quick wash feature
    // val refrigerator = Part4InheritanceAndAccessModification.Refrigerator("Samsung", 1500)
    // refrigerator.turnOff()
    // println("Expected isOn: false")
    // println(refrigerator)
    // refrigerator.showFeatures() // Expected: Refrigerator: has a frost-free feature

    // ---------------------- EXERCISE 2
    println("Exercise 2: Create a base class Employee with name, position, and salary. Derive Manager, Developer, and Intern with additional properties. Add work() methods.")
    // val manager = Part4InheritanceAndAccessModification.Manager("Alice", 90000.0, "Sales")
    // manager.work() // Expected: Alice is managing the Sales department
    // val developer = Part4InheritanceAndAccessModification.Developer("Bob", 80000.0, "Kotlin")
    // developer.work() // Expected: Bob is coding in Kotlin
    // val intern = Part4InheritanceAndAccessModification.Intern("Charlie", 30000.0, "MIT")
    // intern.work() // Expected: Charlie is interning from MIT

    // ---------------------- EXERCISE 3
    println("Exercise 3: Create a class named Course with courseName, instructor, credits, and courseDuration with custom getter and setter.")
    // val course = Part4InheritanceAndAccessModification.Course("Mathematics", "Dr. Smith")
    // course.credits = 3
    // println("Expected credits: 3")
    // println("Expected course duration: ${course.courseDuration} hours") // Expected: 45 hours
    // course.credits = 6
    // println("Expected credits after setting invalid value: 3")

    // ---------------------- EXERCISE 4
    println("Exercise 4: Create a class Athlete with id, name, and fitnessLevel. Add a private method to calculate fitness level.")
    // val athlete = Part4InheritanceAndAccessModification.Athlete("A123", "Jane Doe")
    // println("Expected fitness level: ${athlete.fitnessLevel} (between 0 and 100)")


    println("\n--------------------------------------")
    println("Part 5 Interfaces and Abstract Classes")

    // ---------------------- EXERCISE 1
    println("Exercise 1: Create an abstract class called MediaContent with title, releaseYear, genre, and rating. Add an abstract method playContent().")
    // val movie = Part5InterfacesAndAbstractClasses.Movie("Inception", 2010, "Sci-Fi", 8.8, "Christopher Nolan")
    // movie.playContent() // Expected: Playing movie: Inception directed by Christopher Nolan
    // val series = Part5InterfacesAndAbstractClasses.Series("Breaking Bad", 2008, "Drama", 9.5, 5)
    // series.playContent() // Expected: Playing series: Breaking Bad with 5 seasons
    // val documentary = Part5InterfacesAndAbstractClasses.Documentary("Planet Earth", 2006, "Nature", 9.4, "Wildlife")
    // documentary.playContent() // Expected: Playing documentary: Planet Earth about Wildlife

    // ---------------------- EXERCISE 2
    println("Exercise 2: Create an interface called Account with accountNumber, accountHolder, and balance. Add methods deposit, withdraw, and checkBalance.")
    // val savingsAccount = Part5InterfacesAndAbstractClasses.SavingsAccount("SA123", "Alice", 1000.0, 0.02)
    // savingsAccount.deposit(500.0)
    // println("Expected balance: 1500.0")
    // savingsAccount.withdraw(200.0)
    // println("Expected balance: 1300.0")
    // savingsAccount.withdraw(1500.0)
    // println("Expected balance after failed withdrawal: 1300.0")
    // val currentAccount = Part5InterfacesAndAbstractClasses.CurrentAccount("CA123", "Bob", 500.0, 200.0)
    // currentAccount.deposit(300.0)
    // println("Expected balance: 800.0")
    // currentAccount.withdraw(900.0)
    // println("Expected balance: -100.0")
    // currentAccount.withdraw(200.0)
    // println("Expected balance after failed withdrawal: -100.0")
    // val businessAccount = Part5InterfacesAndAbstractClasses.BusinessAccount("BA123", "Charlie", 2000.0, "Charlie Inc")
    // businessAccount.deposit(1000.0)
    // println("Expected balance: 3000.0")
    // businessAccount.withdraw(1500.0)
    // println("Expected balance: 1500.0")
    // businessAccount.withdraw(2000.0)
    // println("Expected balance after failed withdrawal: 1500.0")

}
