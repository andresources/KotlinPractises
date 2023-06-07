package com.kotlinpractises.nullsafty

fun main(){
    var str: String? = null
    var res = str ?: "NoData"
    println(res)
}