package secondDay
import java.util.Scanner //To get the different types using input
//This file shows basic input and output

public fun main(){
	//println prints a string on a line
	println("Printing on the line")
	//print prints on the same line
	print("Printing on ")
	print("same line.! \n")
	//You can print variables and literals
	
	val score = 12.3
	println("Printing the varaibles/literals")
    println("score")
    println("$score")
    println("score = $score")
    println("${score + score}")
    println(12.3)
	
	
	//Input
	//You can print input using readLine() and store it in a variable
	
	val myName : String? = readLine() //Must be nullable, using the '?'
	println("My name is $myName")
	//To take other types of variables
	val reader = Scanner(System.`in`) //Create a scanner instance
	println("Please input my age: ")
	val myAge : Int = reader.nextInt()
	
	println("My name is $myName and my age is $myAge")
	
	println("Please input my age: ")
	val myMoney : Long = reader.nextLong()
	println("My name is $myName and my age is $myAge")
}
