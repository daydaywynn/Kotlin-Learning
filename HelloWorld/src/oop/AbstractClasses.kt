package oop

/*
 Abstract classes  cannot be instantiated but the subclasses can inherit from them.
 The member properties and methods are only abstract if specified
 
 REMEMBER: IF YOU NEED TO OVERRIDE THE FUNCTION, IT HAS TO BE SPECIFIED WITH 'OPEN' KEYWORD
 */

abstract class AbstractPerson(firstName_ : String, age_ : Int){
	var age : Int = age_
	var name : String = firstName_
	var job : String? = null
	//Non Abstract Function
	fun displayName(){
		println("Name: $name")
	}
	
	
	abstract fun displayJob(nameOfJob : String) //Abstract Function
}


class ChildOfAbstractPerson(firstName_ : String, age_ : Int) : AbstractPerson(firstName_, age_){
	
	//overriding the abstract method
	override fun displayJob(nameOfJob : String){
		println("Job: ${super.job}}") //display job property from super class
	}
	
	fun setJob(job_ : String){ //set job property of super class
		super.job = job_
	}
}