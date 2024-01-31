package oop

/*
 The purpose of this file is to show how the interfaces work.
 An interface contains definitions of abstract methods and implementations of non-abstract methods
 but can't contain any state, therefore the properties have to be abstract
 or has to provide accessor implementations
 */

interface interfaceOne{
	var firstProperty : String
	
	fun firstMethod()
	fun secondMethod() = "Hi" //non-abstract method
	fun thirdMethod(){
		println("Do stuff in here!")
	}
}
interface interfaceTwo{
	var secondProperty : String?
	fun thirdMethod(){
		println("Do stuff in here too!")
	}
	fun fourthMethod()
	fun fifthMethod(){
		println("This is from the second Interface")
	}
}

class implementInterfaceOne : interfaceOne{
	
	override var firstProperty : String = "Hello Interface"
	
	override fun firstMethod() {
		println("Tell me something good")
	}
	
	
}

class implementsMultiple : interfaceOne, interfaceTwo{
	override var firstProperty : String = "Hello Interfaces"
	override var secondProperty : String? = null
	/*
 		To avoid the issuewith having two methods of the same name
 		from the interfaces being implemented. Otherwise, it'll confuse the program
	 */
	override fun thirdMethod(){
		super<interfaceOne>.thirdMethod() //run the first one
		super<interfaceTwo>.thirdMethod() //run the second one
	}
	override fun firstMethod(){
		println("Tell me something better")
	}
	override fun fourthMethod(){
		println("fourthMethod() is here")
	}
}

fun main(){
	var firstObject = implementInterfaceOne()
	
	println(firstObject.secondMethod())
	firstObject.firstMethod()
	firstObject.thirdMethod()
	
	
	var secondObject = implementsMultiple()
	
	secondObject.secondProperty = secondObject.secondMethod()
	secondObject.firstMethod()
	secondObject.fourthMethod()
	secondObject.thirdMethod() 
	
}