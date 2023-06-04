package com.kotlinpractises.oops
//Sealed class is a class which restricts the class hierarchy.
//Sealed class is used when the object is any one of the types from limited set.
/*
Sealed class rules
-------------------
    Sealed classes are abstract and can have abstract members.
    Sealed classes cannot be instantiated directly.
    Sealed classes cannot have public constructors (The constructors are private by default).
    Sealed classes can have subclasses, but they must either be in the same file or nested inside of the sealed class declaration.
*/
sealed class Shape{
    class Circle : Shape()
    class Square : Shape()
    class Triangle : Shape()
    //object NotAShape : Shape()
}

fun eval(e: Shape){
    when(e){
        is Shape.Circle -> println("Circle")
        is Shape.Square -> println("Square")
        is Shape.Triangle -> println("Triangle")
    }
}

fun main(){
    var cir = Shape.Circle()
    eval(cir)
}