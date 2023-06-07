package com.kotlinpractises.javainteroperability

class MyStd1{ //JvmName to rename getter setter names
    @get:JvmName("getMyA")
    @set:JvmName("setMyA")
    var a:Int =10
    var b:Int =20
    get() =
        field
    set(value) {
        field = value
    }
}

fun main(){

}