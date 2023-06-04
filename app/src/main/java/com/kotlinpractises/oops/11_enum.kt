package com.kotlinpractises.oops
enum class Weeks(val mName: String){
    SUN("Sun Day"),
    MON("Mon Day"),
    TUE("Tues Day"),
    WED("Wednes Day"),
    THU("Thurs Day"),
    FRI("Fri Day"),
    SAT("Satur Day")
}

fun main(){
   print(Weeks.FRI.mName)
}