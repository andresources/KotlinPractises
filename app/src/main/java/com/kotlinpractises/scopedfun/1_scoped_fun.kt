package com.kotlinpractises.scopedfun

// scope functions are used to execute a block of code within the scope of an object
//let is used in null safty , let execute block of the code if and only if the value not null, let is used with safe call operator(?.)

fun main(){
    //Ex1 : let with safe call operator(?.)
    var a : String? = null
    a?.let{//if a is null then this block will not executed
        println("Statement-1 : $it")
    }
    println("Statement-2")

    //Ex2: let, with aslo
    var b = "Hello"
    b?.let {
        println("Statement-3 : $it")
    }?.also {
        println("Statement-4 : $it")
    }
}