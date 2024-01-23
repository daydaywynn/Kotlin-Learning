package FirstDay

public fun main(){
	/*
 	*With the variables, you can either use var or val
 	* You don't have to specify the data type if you don't want to, but it
 	* will most likely be easier to understand, so I would suggest you get
 	* into the habit, for other people's sake.!
 	*/
	
	/*
	 * Var is immutable, can't be changed.
 	 * Val is mutable, can be changed! Remember that!
	 */
	var firstName = "Dayday"
	var lastName : String = "Wynn"
	val age : Int = 28 //-2e31 to (2e(31))-1
	var ageTwo : Byte = 0 //-128 to 127
	var ageThree : Short = 0 //-32768 to 32767
	var ageFour : Long = 0 //-2e63 to (2e(63)-1)
	var ageFive : Float = 0.0f 
	var ageSix : Double = 0.0
	
	var character : Char = '3'
	var strings : String = "3"
	var booleans : Boolean = false
	
	println(firstName + " " + lastName + " is " + age + " Years Old!")

}
