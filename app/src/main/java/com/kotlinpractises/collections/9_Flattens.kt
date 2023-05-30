package com.kotlinpractises.collections

fun main(){
    //flatmap works with map
    //flatten doen't work with map
    val deepList = listOf(listOf(1), listOf(2, 3), listOf(4, 5, 6))

    println("Size : "+deepList.flatten().size)

    println("After Size : "+deepList.flatMap { it }.size)
}