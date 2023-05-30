package com.kotlinpractises.collections

fun main(){
    var myList: List<Int> = listOf<Int>(1,2,3,4,5)
    val myTotal = myList.fold(0){ initial, res -> initial + res }
    println("$myTotal")

    val myTotal1 = myList.reduce{ first,second -> first+second }
    println("$myTotal1")

    var mySList: List<String> = listOf<String>("a","b","c")
    val fString = mySList.foldRight("----Elements Are----"){ initVal,res -> res + " - " +initVal }
    println(fString)

    val fString1 = mySList.reduce(){ first,second -> first + " - " +second }
    println(fString1)


}