package com.kotlinpractises.collections

fun main(){
    //Array ->similar data type, fixed size
    //Array of int type with size 5 with all elements as 0
    var myArray = Array<Int>(5){0}

    myArray

    for (item in myArray){
        println("element is ${item}")
    }
    //using range operator
    for(index in 0..myArray.size-1){
        println(" $index index element is ${myArray[index]}")
    }

}