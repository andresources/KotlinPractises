package com.kotlinpractises.functions

fun main(){
    val result = arthmeticOperations(10,20,additionTwo)
    println("$result")
}

fun arthmeticOperations(a:Int,b:Int,additionTwo1:(a:Int,b:Int) -> Int) = additionTwo1(a,b)

val additionTwo:(a:Int,b:Int) -> Int = {num1,num2 ->
     num1 + num2
}



