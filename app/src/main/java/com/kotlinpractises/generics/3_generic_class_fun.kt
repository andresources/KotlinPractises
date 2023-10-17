package com.kotlinpractises.generics

class MyOperClass<A,B>{
    fun <A,B>calFun(data1: A,data2: B){
        println("$data1 - $data2")
    }
}
fun main(){
    MyOperClass<Int,Float>().calFun(23,54f)
    MyOperClass<String,String>().calFun("Hello","Hai")
}
