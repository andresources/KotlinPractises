package com.kotlinpractises.collections
data class Emp(val ename:String,val mno:String)
data class Person(val fistName:String,val lastName:String,val phone:String)
fun main(){
    var list = listOf<String>("ksr","abc","bhav")

    //Names to uppercase
    list
        .map {
            it.uppercase()
        }
        .forEach {
            println("$it")
        }

    //list to Employee list
    data class Employee(val name: String)
    val eList = list.map {
        Employee(it)
    }

    eList.forEach {
        println("Ename : ${it.name}")
    }

    //Ex2: Data Class to another Data class(Person -> Emp)


    var plist = listOf<Person>(Person("ksr","Reddy","909009090"),Person("bhav","Reddy","909009090"))
    var elist = plist.map{
      //  Emp("${it.fistName} - ${it.lastName}",it.phone)
        it.toEmp()
    }

    for(e in elist){
        println("${e.ename}")
    }

}

fun Person.toEmp() = Emp(fistName+" : "+lastName,phone)
