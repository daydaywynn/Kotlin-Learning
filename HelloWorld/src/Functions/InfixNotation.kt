package Functions

//This is a file to show how to use Infix Notation
/*
 Infix can be done only if:
 1. The function is a member function/extension function
 2. only has one parameter
 3. marked with the 'infix' keyword
 
 I'm not sure if i'll be using these, but it's important to know what they are. 
 */
class ShowInFix(){
	infix fun showSquare(num : Int){
		println(num * num)
	}
}
private fun main(){
	val random = ShowInFix() //This is how you create an instance of the class!
	random showSquare 4 //How to use the infix method within the instance!
	
	
}