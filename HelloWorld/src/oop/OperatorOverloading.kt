package oop

/*
 This file is meant to show how to overload operators.
 
 Only a specific set of operators can be overloaded in Kotlin,
 so be sure to look at this page for the list: https://kotlinlang.org/docs/operator-overloading.html
 */

fun main(args: Array<String>) {
    val p1 = Point(3, -8)
    val p2 = Point(2, 9)

    var sum = Point()
    sum = p1 + p2

    println("sum = (${sum.x}, ${sum.y})")
	
	var point = Point(3, -8)
	--point

    println("point = (${point.x}, ${point.y})")
}

class Point(var x: Int = 0, var y: Int = 10) {

    // overloading plus function
    operator fun plus(p: Point) : Point {
        return Point(x + p.x, y + p.y)
    }
	
	operator fun dec() = Point(--x, --y)
}

