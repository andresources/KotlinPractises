package com.kotlinpractises.generics

fun main(){
    var list = listOf<String>("H","E","L","L","0")
    MyListClass<String>().printValues(list)

    var list1: ArrayList<Int> = arrayListOf<Int>(1,2,3,4,5,6)
    MyListClass<Int>().printValues(list1)
}
class MyListClass<T>{
    fun <T>printValues(list: List<T>){
        list.forEach {
            println(it)
        }
    }
}