package com.kotlinpractises.oops

interface I1
{
    fun display1(){
        println("I1 - display1")
    }
}

interface I2
{
    fun display1(){
        println("I2 - display1")
    }
}

class DerivedClass : I1,I2{
    override fun display1() {
       super<I1>.display1()
        println("Derived Display1")
    }
}

fun main(){
    DerivedClass().display1()
}