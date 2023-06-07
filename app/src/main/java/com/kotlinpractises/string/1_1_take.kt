package com.kotlinpractises.string
data class Emp(val ename:String,val eid:Int,val deptid:Int)
fun main(){
    val myList: List<String>?= listOf("a","b","c")
    var abc = myList?.firstOrNull{
        it.equals("a",ignoreCase = true)
    }?: -1
    println("$abc")

    //firstOrNull return first item with give predication is satisfied
    val eList: List<Emp>?= listOf(Emp("KSR",101,1),Emp("Bhav",102,1),Emp("abc",103,2),Emp("xyz",104,3))
    var emp:Emp? = eList?.firstOrNull{
        it?.deptid ==3
    }?: null

    emp?.let {
        println("Name : ${it.ename},Dept : ${it.deptid},EMPID : ${it.eid}")
    }


}