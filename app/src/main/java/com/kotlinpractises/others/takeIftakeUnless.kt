package com.kotlinpractises.others

fun main(){
    var num = getLatency()
    if (num<10) println("if part - $num") else println("else part - $num")

    num?.takeIf { it<10 }?.let {
        println("Join Game $it")
    }?:run{
        println("Sorry Low Internet...")
    }
}

inline fun getLatency() = (0..30).random()