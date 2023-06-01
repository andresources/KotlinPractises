package com.kotlinpractises.others

fun main(){
    var num = getLatency()
    if (num<20) println("Join Game1")

    getLatency()?.takeIf { it<20 }?.let {
        println("Join Game2")
    }
}

inline fun getLatency() = (0..30).random()