package com.kotlinpractises.oops

open class MyParent(x:String){
    init {
        println("parent primary const. : $x")
    }
    constructor(x:String,y:String) : this(x){
        println("parent secondary const. : $x,$y")
    }
}

class MyBase(a:String) : MyParent(a){
    init {
        println("base primary const. : $a")
    }

    constructor(a:String,b:String) : this(a) {
        MyParent(a,b)
        println("base secondary const. : $a")
    }
}

fun main(){
    MyBase("test1","test2")
}