package secondDay

//You must explicitly convert a value to a new data type, unlike Java

fun main(){
	
	/*
 	 * For when you want to convert smaller to Larger types
 	 *
	 */
	var number1 : Int = 55
	val number2 : Long = number1.toLong()

	
	val number3 : Byte = number1.toByte()
	val number4 : Short = number1.toShort()
	val number5 : Float = number1.toFloat()
	val number6 : Double = number1.toDouble()
	val number7 : Char = number1.toChar()
	
	println(number1)
	println(number2)
	println(number3)
	println(number4)
	println(number5)
	println(number6)
	println(number7)
	
	//It's more complicated when you convert larger to smaller type.
	//It may end up with the number being truncated
	
	val number8 : Long = 545344
	val number9 : Byte = number8.toByte()
	
	println("Long: $number8")
	println("That same Long changed to a Byte: $number9")
	/*
	 *	Also check out these articles related to type conversion:
		
		String to Int, and Int to String Conversion
		Long to Int, and Int to Long Conversion
		Double to Int, and Int to Double Conversion
		Long to Double, and Double to Long Conversion
		Char to Int, and Int to Char
		String to Long, and Long to String Conversion
		String to Array, and Array to String Conversion
		String to Boolean, and Boolean to String Conversion
		String to Byte, and Byte to String Conversion
		Int to Byte, and Byte to Int Conversion
	 */
	
}