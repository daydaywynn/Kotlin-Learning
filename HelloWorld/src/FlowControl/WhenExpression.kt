package FlowControl

//This file shows the when expression
//It seems to be similar to a switch

private fun main(){
	
	val a : Int = 10
	val b : Int = 12
	val c : Int = 11
	
	
	
	val result = when(a > b){
		true -> "a is greater than b"
		else -> "a is not greater than b"
	}
	println(result)
	println("Enter a valid operator (*,/,+,-,%)")
	val operator : String? = readLine()
	
	//Using when as an expression
	val resultTwo = when (operator){
		"+" -> "The result is " + (a + b + c)
		"-" -> "The result is " + (a - b - c)
		"*" -> "The result is " + (a * b * c)
		"/" -> "The result is " + (a / b / c)
		"%" -> "The result is " + (a % b % c)
		else -> "That isn't an operator, try again"
		
	}
	println(resultTwo)
	
	//Using when as a statement
	when (operator){
		"+" -> println("The result is  + ${a + b + c}")
		"-" -> println("The result is  + ${a - b - c}")
		"*" -> println("The result is  + ${a * b * c}")
		"/" -> println("The result is  + ${a / b / c}")
		"%" -> println("The result is  + ${a % b % c}")
		else -> println("That isn't an operator, try again")
		
	}
	//You can also combine branch conditions with a comma
	println("Please enter a value 1 - 5")
	val number = readLine()?.toInt()
	var resultThree = when(number){
		1,2,3 -> "The number is less than four"
		4-> "The number is $number"
		else -> "The number is greater than four"
	}
	println(resultThree)
	
	//Also, it can be used with range
	resultThree = when(number){
		in 1..3 -> "The number is between 1 and three, inclusive" //Range
		4-> "The number is $number"
		else -> "The number is greater than four"
	}
	println(resultThree)

	//Can check to see if a value is a particular Type
	resultThree = when(a){
		is Int -> "The value is of an Integer type" 
		else -> "The value is not an Integer"
	}
	println(resultThree)

	//Can use expressions as branch conditions
	
	val d = 34
	val dString = "34"
	when(dString){
		d.toString() -> println("d is $d!")
		else -> println("d is not $d")
	}
	
}