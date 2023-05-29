package com.kotlinpractises.collections

fun main(){
    //Array ->similar data type, fixed size
    //Array of int type with size 5 with all elements as 0

    //Example -1 declaring array with Array Class or IntArray Class
    var myArray = Array<Int>(5){0}

            //OR
    //var myArray1 = IntArray(5){0}

    myArray[0]  = 10
    myArray[1]  = 20
    myArray[2]  = 30
    myArray[3]  = 40
    myArray[4]  = 50

    for (item in myArray){
        println("element is ${item}")
    }
    //using range operator
    for(index in 0..myArray.size-1){
        println(" $index index element is ${myArray[index]}")
    }

    //Example -2 declaration - using arrayOf function
    var myArray1 = arrayOf(1,2,4,5,"a") //accept any type

    //var myArray1 = intarrayOf(1,2,4,5) //accept only int type

    for(index in 0..myArray1.size-1){
        println("${myArray1[index]}")
    }
}