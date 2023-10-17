package com.kotlinpractises.generics
//In,Out, and Where, * star projection
class ParameterizedClass<in T,out R>(private var initem: T,private var outitem: R) where T: Number,R: CharSequence{
    fun getValues() : R {
        println("In get fun : $initem")
        return outitem
    }
}
fun main(){
    var obj = ParameterizedClass<Int,String>(10,"KSR")
    println("Main : ${obj.getValues()}")
    var list = listOf<Int>(1,2,3)
    printAnyArray(list)
}

fun printAnyArray(array:List<Any>){ //Any = *
    array.forEach {
        println(it)
    }
}