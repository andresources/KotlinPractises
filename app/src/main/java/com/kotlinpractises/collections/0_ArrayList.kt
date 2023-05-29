package com.kotlinpractises.collections
fun main(){
    //Array List : to create a dynamic array.
    var myArrayList = ArrayList<Int>(5)
    var myArrayList1:ArrayList<Int> = arrayListOf<Int>()
    myArrayList.add(1)
    myArrayList.add(2)
    myArrayList.add(3)

    var ite=myArrayList.iterator()
    while (ite.hasNext()){
        println(ite.next())
    }


}