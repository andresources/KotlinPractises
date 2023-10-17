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
    var item = Weeks.MON
    var res = when(item){
        Weeks.SUN -> Weeks.SUN.mName
        Weeks.MON -> Weeks.MON.mName
        Weeks.TUE -> Weeks.TUE.mName
        Weeks.WED -> Weeks.WED.mName
        Weeks.THU -> Weeks.THU.mName
        Weeks.FRI -> Weeks.FRI.mName
        Weeks.SAT -> Weeks.SAT.mName
        else -> {
            "UnKnown"
        }
    }
   print(res)
}