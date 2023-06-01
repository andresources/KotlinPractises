package com.kotlinpractises.oops

fun main(){
    var e1 : Employee = Employee("KSR",2000)
    e1.display()
}
class Employee constructor (name:String, sal:Int) {
    var name = ""
    var sal = 0
    init {
        this.name  = name
        this.sal = sal
    }
    fun display(){
        println("${name}")
    }
}