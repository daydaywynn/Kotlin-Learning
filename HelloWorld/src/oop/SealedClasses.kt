package oop

/*
 This file is meant to show the sealed class
 A sealed class is used when a value can have only one of the types from a limited set.
 
 All subclasses of a sealed class must be declared in the same file where sealed class is declared.
 
 A sealed class is abstract by itself, and you cannot instantiate objects from it.
 
 You cannot create non-private constructors of a sealed class; their constructors are private by default.
 */
sealed class Expr
class Const(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()
object NotANumber : Expr()


fun eval(e: Expr): Int =
        when (e) {
            is Const -> e.value
            is Sum -> eval(e.right) + eval(e.left)
            NotANumber -> java.lang.Double.NaN.toInt()
        }


/*
 Enum class and sealed class are pretty similar.
 The set of values for an enum type is also restricted like a sealed class.

The only difference is that,
enum can have just a single instance,
whereas a subclass of a sealed class can have multiple instances.
 */