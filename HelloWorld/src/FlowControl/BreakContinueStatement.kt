package FlowControl

//This file is meant to show the Break and Continue statement at work.

private fun main(){
	//Break
	for (i in 1..10) {
        if (i == 8) {
            break
        }
        println(i)
    }
	
	var sum : Int = 0
	while(true){
		println("Enter a number please")
		var number : Int = readLine()!!.toInt()
		if(number == 0){
			break
		}
		
		sum += number
	}
	
	println("The sum is $sum")
	
	
	//Labeled Break
	println("Labeled Breaks!")
	first@ for(i in 1 .. 20){
		
		second@ for(j in 1 .. 15){
			if(i == 15 && j == 15){
				break@first //breaks the outer loop!
			}
			println("i is $i and j is $j")
		}
		
	}
	//Labeled Continue. Not sure if i'll really use labels, but we will see.
	
	println("Labeled Continue!")
	first@ for(i in 1 .. 20){
		
		second@ for(j in 1 .. 15){
			if(i == 15 && j == 15){
				continue@first //breaks the outer loop!
			}
			println("i is $i and j is $j")
		}
		
	}
}