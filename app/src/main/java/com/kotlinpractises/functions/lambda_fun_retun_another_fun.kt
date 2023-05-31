package com.kotlinpractises.functions

fun main(){
    //Function returns another function
    val myFun = checkHoliday(false)
    myFun()
}

fun checkHoliday(isHoliday:Boolean): () -> Unit{ //() -> Unit : means no args , no return type
  return if(isHoliday) holiday else working
}

val holiday = {
    println("Today is Holiday,Enjoy")
}

val working = {
    println("Today is WorkingDay....")
}
