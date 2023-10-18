package com.kotlinpractises.delegation
/*
To implement class delegation, you need to define an interface, create a class that implements the interface,
   and then use the "by" keyword to delegate the interface implementation to an instance of the implementing class.
 */
interface MyBaseInterface{
    fun getPinDetails() : Int
}

class MyBaseInterfaceImpl : MyBaseInterface{
    override fun getPinDetails(): Int = 1039
}

class MyPinDetailsCls(var myBaseInterface: MyBaseInterface) : MyBaseInterface by myBaseInterface{
    //Here we are passing implementation without directly implementing the interface
    fun printMyPinDetails(){
        println("PIN Details : ${myBaseInterface.getPinDetails()}")
    }
}

fun main(){
    MyPinDetailsCls(MyBaseInterfaceImpl()).printMyPinDetails()
}
