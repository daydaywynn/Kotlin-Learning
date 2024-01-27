package ClassesAndObjects

public fun main(){
	var myLamp = Lamp()
	myLamp.turnOffLamp()
	
	myLamp.turnOnLamp()
	myLamp.turnOffLamp()
	myLamp.tellState()
	
	
	
}

/*
 	How to to define a class

	class ClassName{
		//Member Functions
 		//Properties
	}
*/

//Primary Constructor cannot contain any code!
class Person(val firstName: String, var age: Int) {}

//How to make a primary constructor with code!
class PersonTwo(firstName_: String, age_: Int) {
    val firstName: String
    var age: Int

    // initializer block
    init {
        firstName = firstName_.capitalize()
        age = age_

        println("First Name = $firstName")
        println("Age = $age")
    }
}

class Lamp(){
	//The properties must be initialized or Abstract
	
	private var onOrOff : Boolean = false //Can only be accessed inside of class
	public var randomProp : Int = 9 //Can be accessed outside of class (Default if not specified)
	protected var randomProp2 : Int = 9 //visible to class and subclasses
	internal var randomProp3 : Int = 9 //any client inside the module can access
	
	
	init{
		println("I got a new Lamp!")
		println("It has been plugged in!")
		tellState()
	}
	
	fun Lamp(state : Boolean){ //Constructor with parameter
		onOrOff = state
		tellState()
	}
	
	public fun turnOnLamp( ){//Setter
		if(onOrOff){
			println("Lamp is already on!")
			return
		}
		onOrOff = true
		tellState()
	}
	public fun turnOffLamp(){//Setter
		if(!onOrOff){
			println("Lamp is already off!")
			return
		}
		onOrOff = false
		tellState()
	}
	public fun tellState(){ //Getter
		if(onOrOff){
			println("The lamp is on")
		}
		else{
			println("The lamp is off")
		}
	}
}


//You can have default values in your constructors

class myExampleClass (var myName : String = "Dayday"){}

//Secondary Constructors

open class Bike{
	constructor(wheels : Int){
		
	}
	constructor(motorOrNot : Boolean, wheels : Int){
		if(wheels > 3 && motorOrNot){
			println("This is not a bike, but it's all good.")
		}
	}
}
class motorBike : Bike{
	constructor (wheels : Int) : super(wheels){
		
	}
	
}
