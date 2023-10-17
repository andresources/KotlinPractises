package com.kotlinpractises
data class UserDet(var uid:Int,var uname:String,var address:String)
fun main(){
     var res = MyGenCls<Int,UserDet>(listOf(1,2,3), UserDet(1,"KSY","")).myFun()
     println("Main : ${res.uname}")
}

class MyGenCls<in T,out R>(private var item: List<T>,private var data: R) where T: Number, R: UserDet{
     fun myFun() : R {
        item.let {
            println(it)
        }
         data.apply {
             uid = 2
             uname = "Bhav"
             address = "Hyd"
         }.also {
             println(it.hashCode())
         }
         return data
    }
}