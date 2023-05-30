package com.kotlinpractises.collections

fun main(){
    var myList: List<Int> = listOf<Int>(1,2,3,4,5)
    myList.drop(1).forEach {
        println("$it")
    }

    myList.take(1).forEach {
        println("$it")
    }

}