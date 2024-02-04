package oop

/*
 A Nested class is a class within a class. You do define it like any other class
 but use the '.' to access it. Like a property or method.
 */

class Outer{
	var myOuterString = "Outer String"
	class Inner{
		var myInnerString = "Inner String"
	}
}

/*
 An Inner class is similar to the nested class but has access to the outer members
 
 */

class OuterClass(var a : String){
	
	inner class InnerClass{
		fun callInnerClass(){
			println("Calling inner class with $a")
		}
	}
}

fun main(){
	
	var myObj : Outer = Outer()
	var nestedObj : Outer.Inner = Outer.Inner()
	

	println("${myObj.myOuterString} ${nestedObj.myInnerString}")
	
	
	var myOuterObj : OuterClass = OuterClass("Dayday Wynn")
	
	myOuterObj.InnerClass().callInnerClass() //Calling the inner class from outer class!
}


