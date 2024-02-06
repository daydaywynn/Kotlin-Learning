package oop

/*
 This file is meant to show you how to use Kotlin Extension Functions
 These are used to extend a class with new functionalities.
 Essenitally an extension function is a member function of a class that is defined outside the class.
 
 */

//a method added to the String class that returns a new string with first and last character removed
fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)
fun Persons.AddLastName(lastName_ : String) : String = this.name + " $lastName_"

fun main(args: Array<String>) {
    val myString= "Hello Everyone"
    val result = myString.removeFirstLastChar()
    println("First character is: $result")
	
	val myPersons : Persons = Persons("Dayday")
	println(myPersons.AddLastName("Wynn"))
	
}