package com.kotlinpractises.oops

import android.util.Log.println

sealed class EMP1{
    class HR : EMP1(){
        fun f1() = "I am From HR Team"

    }
    class TECH : EMP1(){
        fun f2() = "I am From TECH Team"
    }
    class SECURITY : EMP1(){
        fun f3() = "I am From SECURITY Team"
    }
    //object NotAShape : Shape()
}

fun eval(e: EMP1){
    when(e){
        is EMP1.HR -> println("${e.f1()}")
        is EMP1.TECH -> println("${e.f2()}")
        is EMP1.SECURITY -> println("${e.f3()}")
    }
}

fun main(){
    var obj = EMP1.HR()
    eval(obj)
}