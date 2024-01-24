package secondDay

//This file has Expressions, Statements, and Block examples
//Expressions are variables, operators, etc. that evaluate to a single value
//Statement is everythign that make up a unit of execution
 		
public fun main(){
	//in Kotlin, 'if' is a Expression
	val max : Int = if(12 > 3) 12 else 3//Assigns 12 if 12 is greater than 3 otherwise it is 3
	println("Your max is $max");
	val age : Int = 28
	val year : Int = 1995
	val thisYear : Int = age + year
	
	println("This year is $thisYear")
	println("In this situation, the 'age + year' is the expression and 'val thisYear : Int = age + year' is the Statement")
	
	//Blocks
	//Blocks are the group of statements that is enclosed in curly braces {}
	if(true){ //beginning of block
		println("Inside of code block")
	}//end of block
}