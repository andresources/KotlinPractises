package com.kotlinpractises.oops

fun main(){
    Child("KSR",123,"IT")
}

open class Parent{
    constructor(name:String,id:Int) {
        println("Parent Secondary constructor $id")
    }
}

class Child : Parent{
    constructor(name:String,id:Int) : super(name,id){
        println("Child Secondary cons. $name")
    }
    constructor(name:String,id:Int,desig:String) : this(name,id){
        println("Child Secondary cons. $desig")
    }
}