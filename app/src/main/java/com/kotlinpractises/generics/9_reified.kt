package com.kotlinpractises.generics
//to access the information related to a class at runtime
fun main(){
    myExample<String>("Hello")
}
inline fun <reified T> myExample(name: T) {
    println("Name -> "+name)
    println("Type of myClass: ${T::class.java}")
}