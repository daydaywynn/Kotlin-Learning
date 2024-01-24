package FlowControl

//this file shows the if..else expression
public fun main(){
	val a : Int = 10
	val b : Int = 34
	val myFirstName : String = "Dayday"
	val myLastName : String = "Wynn"
	
	if(a > b){
		println("$a is greater than $b")
	}
	else{
		println("$a is not greater than $b")
	}
	
	
	//if...else if
	if(myFirstName.length > myLastName.length){
		println("My first name, $myFirstName, is longer than my Last name, $myLastName")
	}
	else if(myFirstName.length < myLastName.length){
		println("My last name, $myLastName, is longer than my first name, $myFirstName")
	}
	else{
		println("My first name and my last name are the same length")
	}
	
	//nested if
	if(a > b){
		if(myLastName.length > myFirstName.length){
			println("My last name is longer than my first name and a is larger than b")
		}
	}
	else{
		if(myLastName.length < myFirstName.length){
			println("My first name is longer than my last name and a is not larger than b")
		}
		else if(myLastName.length > myFirstName.length){
			println("My last name is longer than my first name and a is not larger than b")
		}else{
			println("the length of the names are equal and a is not larger than b")
		}
	}
	
	
}