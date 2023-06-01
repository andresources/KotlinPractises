package com.kotlinpractises.oops

fun main(){
    Student("KSR",30000,"IT").display()
}

class Student(val name1:String){
    var name=""
    var sal  = 0
    var design=""

    init {
        name = name1
        println("Init - $name")
    }

    constructor(name:String,sal:Int) : this(name) { //Here this call Primary Constructor
        this.name = name
        this.sal = sal
        println("constructor - 2 Parms")
    }
    constructor(name:String,sal:Int,desig:String) : this(name,sal){ //Here this is used to call secondary con. with 2 Parms
        this.name = name
        this.sal = sal
        this.design = desig
        println("constructor - 3 Parms")
    }
}

fun Student.display(){ //Extension Fun
    println("Name: $name, Sal : $sal ")
}