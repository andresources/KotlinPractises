package com.kotlinpractises.oops

fun main(){
    var obj = Child("KSR",123,"IT")
}

open class Parent{
    protected var str: String = ""
    constructor(name:String,id:Int) {
        println("Parent Secondary constructor $id")
    }
    open fun display(){

    }
}
class Child : Parent{
    constructor(name:String,id:Int) : super(name,id){
        println("$str Child Secondary cons. $name")
    }
    constructor(name:String,id:Int,desig:String) : this(name,id){
        println("Child Secondary cons. $desig")
    }
    override fun display() {

    }
}

