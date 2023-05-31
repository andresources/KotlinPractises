package com.kotlinpractises.nullsafty

fun main(){
    //Ex1 : Safe Call(?.),Elvis (?:)
    var name:String? =null
    val res = name?.length?:-1
    println("$res")

    //Ex2 Safe Call,let,Elvis
     var res1 = name?.let {
         println("Value : ${it.length}")
     }?:-1

    if(res1==-1){
        println("No Data found")
    }

    //Ex3:Safe call,let,run,Elvis -> This excellent to update UI In Android
    var empList:List<String>? = listOf("a","b")
    empList?.let {
        println("No. of emps : ${empList.size}")
    }?:run{
        println("No Emps found!")
    }

    //Ex4 Elvis
    val str:String? = null
    var resStr = str ?:"Default-Value"
    print(resStr)

}