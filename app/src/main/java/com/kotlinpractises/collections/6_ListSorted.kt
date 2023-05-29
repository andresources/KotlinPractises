package com.kotlinpractises.collections

fun main(){
    var nums = listOf<Int>(10,1,13,0,12)
    nums.sorted().forEach {
        println("$it")
    }

    nums.sortedDescending().forEach {
        println("$it")
    }
    data class Employee(val name:String)
    var names = listOf<Employee>(Employee("Xyz"),Employee("abc"),Employee("Ksr"))
    names.sortedBy {
        it.name.toLowerCase()
    }.forEach {
        println("$it")
    }

}