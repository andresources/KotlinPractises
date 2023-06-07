package com.kotlinpractises.javainteroperability

data class MyEmp(@JvmField var a:Int,var b:Int)

object MyEmp1{
    @JvmField
    var a = 10
}