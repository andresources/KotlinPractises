package com.kotlinpractises

import com.kotlinpractises.javainteroperability.a11
import com.kotlinpractises.javainteroperability.f11

data class Products(val name:String, var price:Int)
data class Products1(val name:String, var price:Int)
fun main(){
    val list1 = listOf(Products("P1",100),Products("P2",200))
    val list2 = listOf(Products("P3",400),Products("P4",300))
    f11()
}

