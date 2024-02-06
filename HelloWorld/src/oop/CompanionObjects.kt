package oop

/*
 This file is meant to show companion objects and what they are.
 Companion objects allow you to be able to call a method by using the class name.
 
 A companion is similar to the static methods in Java.
 
 Companion objects can also access private members of a class,
 which means they can be used to implement factory method patterns. 
 */

class CompanionPerson{
	companion object compPer{
		fun callThisPerson() = println("Called companion object")
	}
	
}

fun main(){
	CompanionPerson.callThisPerson() //No need to create an object!
}