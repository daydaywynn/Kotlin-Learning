package oop

/*
 Object is used to create singletons. Singletons are classes that can only have one instance in an application.
 Below is how you create an object/singleton.
 
 Object declaration can inherit from classes and interfaces.
 
 Objects are not ideal in large software systems that interfaces
 */
open class myClass{
	var hello : String = "Hi Everybody"
	
	open fun changeHello(){
		hello = "Hello Everybody"
	}
	
}

open class Persons(name_ : String){
	var name : String = name_
	open fun getNames() : String{
		return name
	}
}
object SingletonExample {
	private var a: Int = 0
    var b: Int = 1

    fun makeMe12(): Int {
        a = 12
        return a
    }
}

fun main(){
	
	val res : Int
	
	res = SingletonExample.makeMe12() //No constructor necessary
	
	println("Result is $res")
	println("b is ${SingletonExample.b}")
	
	//Anonymous Class
	val anonymousExample = object : myClass(){
		override fun changeHello(){
			println("Changing hello")
			hello = "HII Everybody"
		}
	}
	
	val anonymousExampleTwo = object : Persons("Dayday"){
		override fun getNames() : String{
			return "The name is $name"
		}
	}
	
	println(anonymousExample.hello)
	anonymousExample.changeHello()
	println(anonymousExample.hello)
	
	
	println(anonymousExampleTwo.getNames())
}

/* ANONYMOUS CLASSES
 Objects can be used to create objects of anonymous classes.
 An anonymous class is used when you need to create an object with a slight modification
 of a class or interface without declaring a subclass.
 */

