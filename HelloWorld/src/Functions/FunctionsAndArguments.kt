package Functions

//This file is meant to show how to use Functions

private fun main(){
	
	val firstNum : Double = 1.90
	val secondNum : Double = 2.34
	println("Regular Functions with Arguments")
	println("The sum is ${addNums(firstNum,secondNum)}")
	println("The sum is ${addNumss(firstNum,secondNum)}")
	println("The sum is ${addNumss(firstNum,secondNum)}")
	
	//To show the named arguments
	println("Functions with Named Arguments")
	println("The sum is ${addNumss(firstNum)}")

	println("The sum is ${addNumss_(number1 = secondNum)}")
	
	println("The sum is ${add_Numss(number2 = secondNum)}")
	
	println("The sum is ${add_Numss(number2 = secondNum, number1 = firstNum)}")

}


//Function that takes two arguments and returns an Integer, despite the arguments being Doubles
public fun addNums(number1 : Double , number2 : Double) : Int{ 
	return (number1 + number2).toInt()
}

//Can be rewritten like this
public fun addNums_(number1 : Double, number2 : Double) : Int = (number1 + number2).toInt()
//Remember, this can only be done when the function returns a single expression. You can also omit the return type
public fun add_Nums(number1 : Double, number2 : Double) = (number1 + number2).toInt()
//I wouldn't program like this, only because I'd want people to be able to read my program.


//Default and Named Arguments
public fun addNumss(number1 : Double = 2.0, number2 : Double = 4.0) : Int{
	return (number1 + number2).toInt()
}
//Can be rewritten like this
public fun addNumss_(number1 : Double = 2.0, number2 : Double = 4.0) : Int = (number1 + number2).toInt()
//Remember, this can only be done when the function returns a single expression. You can also omit the return type
public fun add_Numss(number1 : Double = 2.0, number2 : Double = 4.0) = (number1 + number2).toInt()
//I wouldn't program like this, only because I'd want people to be able to read my program.