package com.kotlinpractises.generics
//Function with Different Types
//If Input is Int do some oper. then do Other operation
class MyRefCls<in T,out R>{
    inline fun<reified T> displayMessage(data: T) : R{
        return when(T::class){
            Int::class -> "You Enter Int - Here Do Some Oper." as R
            String::class -> "You enter string - Here Do Some Other Oper." as R
            else -> "Else" as R
        }
    }
}
fun main(){
    var obj = MyRefCls<Any,Any>()
    var res = obj.displayMessage(2)
    println(res)
    //Find even average
    var list = listOf<Any>(13,"KSR",false,23f,13,15)
    list.filterIsInstance<Int>().let {
        it.filter { it % 2 ==0
        }.average().let {
            if(!it.isNaN()){
                println("avg : $it")
            }else{
                println("avg : 0.0")
            }
        }
    }
}
