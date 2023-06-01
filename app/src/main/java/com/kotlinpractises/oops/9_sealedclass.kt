package com.kotlinpractises.oops
//Sealed class is a class which restricts the class hierarchy.
//Sealed class is used when the object have one of the types from limited set,
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