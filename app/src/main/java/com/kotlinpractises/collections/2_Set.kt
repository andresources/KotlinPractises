package com.kotlinpractises.collections

fun main(){
    //Don't allow duplicate, order is not followed
    //Immutable
    var mSet:Set<Any> = setOf(1,3,3,4)
    var mSet1:Set<String> = setOf<String>("a","b")
    for (item in mSet){
        println("Element $item")
    }

    //Mutable
    var mSet2:MutableSet<Any> = mutableSetOf(1,3,3,4)
    mSet2.add("5")

    for (item in mSet2){
        println("Element $item")
    }

    //HashSet -> it follows hashing tech, while storing info.
    var mSet3: HashSet<String> = hashSetOf()

}