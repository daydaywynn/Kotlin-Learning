package secondDay

public fun main(){
	//Operators
	//Still the regular: +, -, *, /, %

	var sentence: String = "In two years i'll be "
	val age : Int = 28
	var result : Int = age + 2
	val birthMonth : String = "July"
	val birthDay : String = "21"
	val birthYear : String = "1995"
	
	println(sentence + result)
	println("That's calculated by $age + 2 to give you $result")
	
	//Assignment
	//=, +=, -=, /=, %=
	var evenNumber : Boolean = result % 2 == 0
	println("Is that an even number? Find out using $result % 2 to give you $evenNumber")
	result += 4
	println("In six years i'll be $result and that's calculated using result += 4 or $age + 6")
	
	//Unary prefix & Increment/Decrement Operators
	// --, ++, +, -, !
	
	println("Last year at this time I was " + (result - 7))
	println("My birthdate is in $birthMonth")
	println("Which is why i'm $age")
	println("I'll be " + ++result + " in seven years and " + ++result + " in eight years")
	result = age
	println("At " + --result + " I went to NYC twice. At " + ++result + " I will go twice again, hopefully")
	
	//Comparison and Equality Operators
	// >, <, >=, <=, ==, !=
	
	var boolRes : Boolean = result > age
	println("Is $result > $age? $boolRes")
	boolRes = result > age
	println("Is $result < $age? $boolRes")
	boolRes = result == age
	println("Is $result == $age? $boolRes")
	boolRes = result != age
	println("Is $result != $age? $boolRes")
	
	//Logical Operators
	// || or &&
	boolRes = (result == age) || (result != age)
	println("(4result == $age) || ($result != $age)? $boolRes")
	boolRes = (result == age) && (result != age)
	println("($result == $age) && ($result != $age)? $boolRes")
	
	//'in' operator
	//Checks to see if something is in a collection
	
	val numbers = intArrayOf(2,34,56,123)
	boolRes = 5 in numbers
	if (!boolRes){
		println("is 5 in the collection? $boolRes" )
	}
	
	//Index access Operator
	//[]
	println(numbers[1])
	numbers[1] = 345
	println(numbers[1] == 23)
	
	//bitwise Operations
	//shl (shift left),
	//shr (shift right),
	//ushr (unsigned shift right),
	//and (bitwise and),
	//or (bitwise or),
	//xor (bitwise exclusive or),
	//inv (bitwise inversion) 
	
	
	
	
}
