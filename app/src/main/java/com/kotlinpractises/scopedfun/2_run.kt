package com.kotlinpractises.scopedfun
class Student{
    var name: String = "Hello"
}
fun main(){
    var std:Student? = null
    std?.run {//execute even object is null
        println("$this")
    }

    with(std){
        println("${this?.name}")
    }
}