package com.kotlinpractises.exceptionhandling

fun main(){
    //try and catch or finally or both
    //Ex1
    var a = 10
    var b = 0
    var res = try { //try as experssion
         a / b
        println("try block")
        10 //last statement is return type
    }catch (e: ArithmeticException) {
        println("ArithmeticException block")
        0
    }catch (e: Exception){
        println("Exception block")
        -1
    }
    println("$res")

    //Ex2 try catch as express & lamdafun
    val myF=divideFun
    val res1 = myF(a,b)
    println("Result : $res1")
}
//In lambda no need of return statement
val divideFun = {   a:Int,b:Int ->
    try { //try as experssion
        a / b
    }catch (e: ArithmeticException) {
        0
    }catch (e: Exception){
        -1
    }
}