package com.kotlinpractises.collections

import android.annotation.SuppressLint

@SuppressLint("SuspiciousIndentation")
fun main(){
    //Data is stored in term of key value pair
    //Ex1 : Immutable
    var myMap:Map<Int,String> = mapOf<Int,String>(1 to "a", 2 to "b", 3 to "c")
    for (key in myMap.keys){
        println("$key - ${myMap.get(key)}")
    }

    var myTemp = myMap.plus(4 to "d") //Add Item to Map and return new map collection

    for (key in myTemp.keys){
        println("$key - ${myTemp.get(key)}")
    }

    //Ex2 : Mutable Map
    var myMap1:MutableMap<Int,String> = mutableMapOf<Int,String>(1 to "a", 2 to "b", 3 to "c")
        myMap1.put(10,"3")
    for (key in myMap1.keys){
        println("$key - ${myMap1.get(key)}")
    }

    //Ex3: HashMap

    var mHashMap : HashMap<Int,String> = HashMap<Int,String>(3)
    var mHashMap1 : HashMap<Int,String> = hashMapOf<Int,String>()

    mHashMap.put(1,"x")
    mHashMap.put(2,"y")
    mHashMap.put(3,"z")
    mHashMap.put(4,"a")

    for (key in mHashMap.keys){
        println("HM -> $key - ${mHashMap.get(key)}")
    }


}