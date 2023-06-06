package com.kotlinpractises.lateinitlazy

import kotlin.system.measureTimeMillis

class ABC(){
    lateinit var a:String
    val b by lazy {
        20
    }

    val obj by lazy { Heavy()
    } //time taken for ABC Object creationing is 1004 sec.
    //val obj = Heavy() //time taken for ABC Object creationing is 6004 sec(ABC + Heavy object creation time)
    init {
          Thread.sleep(1000)
    }
}

class Heavy{
    init {
        Thread.sleep(5000)
    }
}

fun main(){
    val x = measureTimeMillis {
        ABC()
    }
    println(x)
}