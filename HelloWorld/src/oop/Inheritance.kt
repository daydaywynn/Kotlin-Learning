package oop

/*
 This file is meant to show how to use inheritance when creating classes and subclasses
 By default, classes are 'final' but to allow for subclasses you make the parent class
 an 'open' class. Ex: Person
 
 The visibility modifiers are: public, private, internal, protected
 public - declarations are visible everywhere
 private - visible inside the file containing declaration
 internal - visible inside same module (set of files compiled together)
 protected - only used for subclasses, not for packages
 
 NOTE: IF YOU OVERRIDE A PROTECTED MEMBER BUT DON'T SPECIFY ITS VISIBILITY THEN IT WILL BE PROTECTED TOO
 NOTE2: CONSTRUCTORS CAN ALSO HAVE VISIBILITY MODIFIERS
*/

fun main(){
	var firstPerson : Person = Person("dayday", "wynn", 'M', 28)
	firstPerson.getName()
}

open class Person(firstName_ : String, lastName_ : String, sex_ : Char, age_ : Int){
	private var firstName : String = firstName_.replaceFirstChar{it.uppercase()} //visible inside of Inheritance.kt
	private var lastName : String = lastName_.replaceFirstChar{it.uppercase()} //visible inside of Inheritance.kt
	protected open var salary : Int? = null //must be open, so that the derived classes can access the variable
	private var jobTitle : String? = null //visible inside of Inheritance.kt
	private val sex : Char = sex_ //visible inside of Inheritance.kt
	private val age : Int = age_ //visible inside of Inheritance.kt
	
	fun setJobTitle(jobTitle : String)	{ //visible to all (public)
		this.jobTitle = jobTitle
	}
	open protected fun setSalary(salary : Int){ //Must be open to allow derived classes to override/access
		this.salary = salary
	}
	fun getName(){
		println("First Name $firstName \nLast Name: $lastName")
	}
}

class Engineer(firstName_ : String, lastName_ : String, sex_ : Char, age_ : Int) : Person (firstName_, lastName_, sex_, age_){
	init{
		super.setJobTitle("Engineer")
	}
	private var manager : Engineer? = null
	private var managerOrNot : Boolean = false
	
	fun displayManagerName(){
		println("My manager's name is ${manager?.getName()}")
	}
	
	
	
}

class Teacher(firstName_ : String, lastName_ : String, sex_ : Char, age_ : Int) : Person (firstName_, lastName_, sex_, age_){
	init{
		super.setJobTitle("Teacher")
	}
	var classSize : Int? = null
	var manager : Teacher? = null
	//Overriding property
	override var salary : Int? = null //protected, becuase the visibility modifier wasn't specified
	
	init{
		super.setJobTitle("Teacher")
	}
	
	fun displayManagerName(){
		println("My manager's name is ${manager?.getName()}")
	}
	
	fun displayClassSize(){
		if(classSize == null){
			println("I haven't been given a class yet")
			return
		}
		println("My class size is ${this.classSize}")
	}
}