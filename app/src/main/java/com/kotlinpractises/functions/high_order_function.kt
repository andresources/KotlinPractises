package com.kotlinpractises.functions

fun main(){
    var list: List<Int> = listOf(1,2,3,4,5)
    list.myHighOrderFun { it % 2 ==0 }.let {
        println(it)
    }

    list.myHighOrderFun{
        condition(it)
    }.let {
        println(it)
    }
}

val condition: (Int) -> Boolean = { num ->
    num % 2 ==0
}

fun <T>List<T>.myHighOrderFun(cond:(T)->Boolean) : List<T> {
    var myList: ArrayList<T> = arrayListOf<T>()
    for (item in this){
        if(cond(item)){
            myList.add(item)
        }
    }
    return myList
}