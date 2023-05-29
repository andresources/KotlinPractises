package com.kotlinpractises.collections

fun main(){
    //Filters
    //Ex1
    var myList = listOf("KsR", "Bhav", "abc", "XYZ")
    var temp = myList.filter{ it.contains("z",ignoreCase = true) }
    for (item in temp){
        println("$item")
    }

    //Ex2
    var myNumbers = listOf<Int>(1,2,-1,0,3,4,-6)
    var posNumbers = myNumbers.filter { it>=0 }
    var negNumbers = myNumbers.filter { it<0 }
    for (item in posNumbers){
        println("$item")
    }
    for (item in negNumbers){
        println("$item")
    }

    //Ex3 -> Filter & Map
    data class Emp(val ename: String,val dept:String)
    var empList = listOf<Emp>(Emp("KSR","IT"),Emp("Bhav","Non"))
     empList
         .filter { it.dept.equals("it",ignoreCase = true) }
         .map { it.ename.toLowerCase() }
         .forEach {
             println("$it")
         }
    //Ex4 ->Partition
    var (deptIT,deptNoNIT) = empList.partition {
        it.dept.equals("it",ignoreCase = true)
    }
    for (item in deptNoNIT){
        println("$item")
    }

    //Ex5 -> any,non,all return true,false
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.any { it.endsWith("e") }) //return true
    println(numbers.none { it.endsWith("a") }) //return true
    println(numbers.all { it.endsWith("e") }) //return false


}
