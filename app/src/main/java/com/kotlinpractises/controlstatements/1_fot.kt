package com.kotlinpractises.controlstatements

fun main(){
    val myList = listOf<Int>(11,22,33,44,55)
    //Ex1 foreach
    for(item in myList){
        println("$item")
    }

    //Ex2 range
    for(index in 0.. myList.size-1){
        println("${myList.elementAt(index)}")
    }

    //Ex3 until
    for(index in 0 until myList.size){
        println("${myList.elementAt(index)}")
    }

    //Ex4 step
    for(index in 0.. myList.size-1 step 2){
        println("${myList.elementAt(index)}")
    }

    //Ex5 downTo
    println("--- downTo ---")
    for(index in myList.size-1 downTo 0 step 1){
        println("${myList.elementAt(index)}")
    }

    //Ex6 forEach
    myList.forEach {
        println("$it")
    }

    //Ex7 forEachIndexed
    myList.forEachIndexed { index,value ->
        println("Index : $index  ->  Element : $value")
    }

   //Ex8 Repeate
    repeat(3) { index ->
        println("Hello at $index")
    }

    repeat(myList.size){ index ->
        println("repeat - ${myList.get(index)}")
    }

}