package com.kotlinpractises.collections
fun main(){
    //List follows order and contains duplicates
    //arrayListOf(F) -> ArrayList(C) -> MutableList(I) -> List(I) -> Collection(I) -> Iterable(I)

    /* Collections -> 2 types
      1.Immutable Collection (or Collection)
      2.Mutable Collection)*/
   /*
   Immutable Collection (read only functionalities.)
   =====================
   1. List (listOf() function)
   2. Set (setOf() function)
   3. Map (mapOf() function)
   */

    /*
   Mutable Collection (read only functionalities.)
   =====================
   1. List (arrayListOf(),mutableListOf() function)
   2. Set (hashSetOf(),mutableSetOf() function)
   3. Map (hashMapOf(),mutableMapOf() function)
   */


    //Ex1: Immutable List
    var myList = listOf("abc",5,6,5)//read only, and any type (No add(),remove() fun.)
    var myList1: List<String> = listOf<String>("a","b") //Read only - and string type
    var myList2: List<Any> = listOf<Any>("a","b",5,66.7)//Read Only - Any Type

    for(item in myList){
      println("${item}")
    }

    for (index in 0.. myList.size-1)
    {
        println("Element ${myList.get(index)}")
    }

    //Ex2: Mutable List
    var mList = mutableListOf<Any>("abc")
    var mList1:MutableList<String> = mutableListOf<String>("abc","1")
    mList.add(123)
    mList.add(12.3)

    mList.forEachIndexed{ index,item ->
        println("Element : ${mList.elementAt(index)}")
    }


}
