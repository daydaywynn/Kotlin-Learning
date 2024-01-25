package FlowControl

//This file is meant to show how a for loop works
private fun main(){
	
	//syntax: for(item in collection){}
	println("Counting up")
	for(i in 1..5){
		println(i) //prints every number from 1 to 5, inclusive
	}
	
	for(i in 6..10) println(i) // Also valid, but I wouldn't program like this.
	 println("Counting down from 5, using downTo")
	for(i in 5 downTo 1){
		println(i) //going down
	}
	println("Stepping by 2 through range! 1 through 10, inclusive and going up by 2")
	for(i in 1..10 step 2){
		println(i)
	}
	
	println("Stepping by 2 through range! counting down from 10 to 1, inclusive and going down by 2")
	for(i in 10 downTo 1 step 2){
		println(i)
	}
	
	//How to iterate through an Array!
	println("Iterate through an array")
	var language = arrayOf("Ruby", "Kotlin", "Python", "Java")
	
	for(item in language){
		println(item)
	}
	//language.indices returns all indices of an array element
	println("iterate through an array with an index")
	println("This is what language.indices returns: ${language.indices}")
	for(item in language.indices){
		println("index at $item is ${language[item]}")
	}
	
	
	//iterating through a string
	println("Iterating through a string.")
	var text : String = "De Kwaan Wynn"
	for(letter in text){
		println(letter)
	}
	
	//iterating 
	for(letter in text.indices){
		println("The letter at index $letter is ${text[letter]}")
	}
}