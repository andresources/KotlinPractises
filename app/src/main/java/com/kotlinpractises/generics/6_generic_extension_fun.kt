package com.kotlinpractises.generics

fun main(){
    var list : ArrayList<String> = arrayListOf("Hari","Hello")
    list.printValues()

    var list1 : ArrayList<Int> = arrayListOf(1,2,3,4,5)
    list1.printEvenNumbers { it % 2 ==0 }
}
fun <T>ArrayList<T>.printValues() {
    forEach {
       println(it)
    }
   /*(or)
    for (item in this){

    }*/
}

fun <T>ArrayList<T>.printEvenNumbers(cond:(T)->Boolean){
    forEach {
        if(cond(it))
        println(it)
    }
    /*(or)
     for (item in this){

     }*/
}