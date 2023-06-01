package com.kotlinpractises.generics

fun main(){
    MyClass<String>().display("Hello")
}

class MyClass<T>{
    fun display(a:T) {
        println("$a")
    }
}