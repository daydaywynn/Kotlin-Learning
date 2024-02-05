package oop

/*
 Data classes are for holding data. This is a file meant to show how to create them.
 The compiler automatically generates the below methods/functions:
 1. copy()
 2. equals()
 3. hashCode()
 4. toString()
 5. componentN()
 
 Data Class Requirements:
 1. primary class must have at least one parameter
 2. the parameter miust be either val or var
 3. class can't be open, abstract, inner, or sealed
 4. class must extend other class or implement interface.
 */

data class User(val name : String, val age: Int)

fun main(){
	//Create a data objects
	var firstDataClass : User = User("Dayday Wynn", 28)
	var secondDataClass = User("Dayday D. Wynn", 28)
	
	
	println("firstDataClass -> ${firstDataClass.name} is ${firstDataClass.age} ")
	println("secondDataClass -> ${secondDataClass.name} is ${secondDataClass.age}")
	
	//Using the copy() function
	var thirdDataClass = firstDataClass.copy()
	var fourthDataClass = firstDataClass.copy(name = "DW")
	
	println("thirdDataClass -> ${thirdDataClass.name} is ${thirdDataClass.age} ")
	println("fourthDataClass -> ${fourthDataClass.name} is ${fourthDataClass.age}")
	//Using the toString() function
	var fifthDataClassString = thirdDataClass.toString()
	println("fifthDataClassString -> ${fifthDataClassString}")
	
	//Using the hashCode() and equals()
	var sixthDataClassHashCode = thirdDataClass.hashCode()
	println("sixthDataClassHashCode -> $sixthDataClassHashCode")
	println("Is sixthDataClassHashCode equal to fourthdataClass' hash code? -> ${sixthDataClassHashCode.equals(fourthDataClass.hashCode())} ")
	println("Is thirdDataClass' hash code equal to firstDataClass' hash code? -> ${thirdDataClass.hashCode().equals(firstDataClass.hashCode())}")

	/*
 		It is also possible to destructure a data class into separate variables.
 		This could prove to be useful in the future!
	 */
	
	var (name, age) = firstDataClass //assigning the name and age to their own variables.
	println("The name is $name and the age is $age")
}