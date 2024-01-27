package Functions

fun main() {
    val number = 4
    val result: Long

    result = factorial(number)
    println("Factorial of $number = $result")
	
	val result_ = factorials(number)
    println("Factorial of $number = $result_")
}
//A regular recursive function
fun factorial(n: Int): Long {
    return if (n == 1) n.toLong() else n*factorial(n-1)
}

//A rewritten recursive function
fun factorials(n: Int): Long = if (n == 1) n.toLong() else n*factorial(n-1)