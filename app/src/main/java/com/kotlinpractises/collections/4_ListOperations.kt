package com.kotlinpractises.collections

fun main(){
    //1.Reverse 2.Sort, 3.Search
    var myList = listOf("KsR", "Bhav", "abc", "XYZ")
    println("------ Original List ----")

    for (item in myList){
        println("$item")
    }
    //1. Reverse Order using asReversed() returns new list
    println("------ Reversed List ----")
    var tmp = myList.asReversed()
    for (item in tmp){
        println("$item")
    }

    //2. Search item (first sort list)
    var sortedTemp = myList.sorted()
    for (item in sortedTemp){
        println("$item")
    }
    var pos = sortedTemp.binarySearch("ksr", String.CASE_INSENSITIVE_ORDER)
    println("element found at $pos")

    //2.1 Custom Serach
    val valueToFind = "ksr"
    data class Employee(val ename: String)
    val boxes = sortedTemp.map { Employee(it) }
    val index = boxes.binarySearch { String.CASE_INSENSITIVE_ORDER.compare(it.ename, valueToFind) }
    if (index >= 0) {
        println("Value at $index is ${boxes[index]}") // Value at 3 is Box(value=Box)
    } else {
        println("Emp with value=$valueToFind was not found")
    }

}