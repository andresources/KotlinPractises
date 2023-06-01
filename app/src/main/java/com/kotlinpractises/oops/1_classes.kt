package com.kotlinpractises.oops
fun main(){
    var e1 : Emp = Emp()
    e1.display()
}
class Emp {
    val ename="KSR"
    var sal = 2000
    fun display(){
        println("${ename}")
    }
}