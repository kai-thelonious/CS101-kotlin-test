package com.example.cs101_test.exercises

object Part5InterfacesAndAbstractClasses {

    // ---------------------- EXERCISE 1
    // Create an abstract class called MediaContent with 4 properties: title, releaseYear, genre, and rating
    // Add an abstract method: playContent() that needs to be implemented by subclasses
    // Create 3 classes (Movie, Series, and Documentary) that extend the MediaContent class
    //   - Movie class should have an additional property: director
    //   - Series class should have an additional property: seasons
    //   - Documentary class should have an additional property: subject
    // Each subclass should override the playContent() method to print a message specific to its type

    abstract class MediaContent(
        val title: String,
        val releaseYear: Int,
        val genre: String,
        val rating: Double
    ) {
        abstract fun playContent()
    }

    class Movie(
        title: String,
        releaseYear: Int,
        genre: String,
        rating: Double,
        val director: String
    ) : MediaContent(title, releaseYear, genre, rating) {
        override fun playContent() {
            println("Playing $title...")
        }
    }

    class Series(
        title: String,
        releaseYear: Int,
        genre: String,
        rating: Double,
        val seasons: Int
    ) : MediaContent(title, releaseYear, genre, rating) {

    }

    class Documentary(
        title: String,
        releaseYear: Int,
        genre: String,
        rating: Double,
        val subject: String
    ) : MediaContent(title, releaseYear, genre, rating) {
        override fun playContent() {
            println("Playing $title...")
        }
    }

    // ---------------------- EXERCISE 2
    // Create an interface called Account with 3 properties: accountNumber, accountHolder, and balance (Double)
    // Add methods: deposit(amount: Double), withdraw(amount: Double), and checkBalance() that need to be implemented by classes
    //      checkBalance should return a Double
    // Create 3 classes (SavingsAccount, CurrentAccount, and BusinessAccount) that implement the Account interface
    //   - SavingsAccount should have an additional property: interestRate
    //   - CurrentAccount should have an additional property: overdraftLimit
    //   - BusinessAccount should have an additional property: businessName
    // Each class should implement the methods to manage deposits and withdrawals with specific rules for each account type
    //      This means that for the CurrentAccount class, the withdraw function will be successful as long as
    //          the amount is less than or equal to the sum of the balance and overdraftLimit
    //      Should you try to withdraw more money than allowed, it should print: "Insufficient funds"

    interface Account {
        val accountNumber: String
        val accountHolder: String
        val balance: Double

        fun deposit(amount: Double) {

        }
    }

}
