package com.example.cs101_test.exercises

object Part4InheritanceAndAccessModification {
    // ---------------------- EXERCISE 1
    // Create a base/open class called Appliance with 3 properties: brand, powerConsumption, and isOn
    // Add a method: turnOn() that sets isOn to true
    // Add another method: turnOff() that sets isOn to false
    // Override the toString method such that if an appliance object is printed, it will return a string in the following format:
    //      [brand=brandValue, powerConsumption=powerConsumptionValue, isOn=isOnValue]
    // Create 2 classes (WashingMachine and Refrigerator) that extend the Appliance class
    //      and add a method to show/print their unique features e.g. has a quick wash feature (showFeatures).
    //      The showFeatures method must print something and not be blank, but you can choose what you want it to print!
    open class Appliance(val brand: String, val powerConsumption: Int, var isOn: Boolean) {
        fun turnOn() {
            isOn = true
        }
        fun turnOff() {
            isOn = false
        }
        override fun toString(): String {
            return "[brand=$brand, powerConsumption=$powerConsumption, isOn=$isOn]"
        }
    }
    class WashingMachine(brand: String, powerConsumption: Int) : Appliance(brand, powerConsumption, false) {
        fun showFeatures() {
            println("This washing machine has a quick wash feature.")
        }
    }
    class Refrigerator(brand: String, powerConsumption: Int) : Appliance(brand, powerConsumption, false) {
        fun showFeatures() {
            println("This refrigerator has a freezer feature.")
        }
    }

    // ---------------------- EXERCISE 2
    // Create a base class called Employee with properties: name, position, and salary
    // Derive three classes Manager, Developer, and Intern from Employee
    // Implement the following extra properties: department for Manager, programmingLanguage for Developer, school for Intern
    // Implement the method work() for all classes, which prints a message indicating the type of work the employee is doing
    // E.g. an Employee.work() should print one thing and Developer.work() another
    // The work() method must print something and not be blank, but you can choose what you want it to print!

    open class Employee(
        val name: String,
        val position: String,
        val salary: Double
    ) {
        open fun work() {
            println("$name is working")
        }
    }

    class Manager(
        name: String,
        salary: Double,
        val department: String
    ) : Employee(name, "Manager", salary) {
        override fun work() {
            println("$name is managing the $department department")
        }
    }

    class Developer(
        name: String,
        salary: Double,
        val programmingLanguage: String
    ) : Employee(name, "Developer", salary) {
        override fun work() {
            println("$name is developing in $programmingLanguage")
        }
    }

    class Intern(
        name: String,
        salary: Double,
        val school: String
    ) : Employee(name, "Intern", salary) {
        override fun work() {
            println("$name is learning at $school")
        }
    }

    // ---------------------- EXERCISE 3
    // Create a class named Course to represent course information
    // Include the properties courseName and instructor
    // Create a variable called credits
    // Implement a custom setter for the credits property to ensure that the credits can only be set if they are within the valid range (1 to 5)
    // Implement a custom getter for the courseDuration property to calculate the course duration based on the number of credits
    //      Assume that each credit equals 15 hours when calculating courseDuration
    // -- Example of another use case with getter and setter methods:
    // Let's say we have a class called Person with a property age. We want to ensure that the age is always set within a valid range (0 to 150).
    // In this case, the getter returns the current age, and the setter validates the age before setting it.
    // class Person {
    //     var age: Int = 0
    //         get() = field
    //         set(value) {
    //             field = if (value in 0..150) value else 0
    //         }
    // }

    class Course(val courseName: String, val instructor: String) {
        var credits: Int = 1
            set(value) {
                if (value in 1..5) {
                    field = value
                } else {
                    println("Credit has to be in between 1-5")
                }
            }

        val courseDuration: Int
            get() = credits * 15
    }

    // ---------------------- EXERCISE 4
    // Create a class Athlete with properties: id, name
    // Implement a private function to calculate the athlete's fitness level (calculateFitnessLevel)
    // To make calculateFitnessLevel easy to implement, just make it return an Int between 0 and 100 - you choose how to calculate it!
    // The class should have a public field fitnessLevel which uses the private function to return a result.
    // The setter for fitnessLevel should be private

    class Athlete(val id: String, val name: String) {
        var fitnessLevel: Int = calculateFitnessLevel()
            private set

        private fun calculateFitnessLevel(): Int {
            return (0..100).random()
        }
    }

}
