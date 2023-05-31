package com.kotlinpractises.controlstatements

fun main(){
    var a = 10
    var b = 20
    var res = ""
    if(a > b){
        res = "a is grater than b"
    }else{
        res = "b is grater than a"
    }

    println(res)

    //ex2 if is an expression
    res = if(a > b){
         "a is grater than b"
    }else{
        "b is grater than a"
    }
    println(res)

    //ex3 singleline
    res = if(a > b) "a is grater than b" else "b is grater than a"
    println(res)

    //ex4 in operator if condition
    var names = listOf<String>("KSR","bhav","abc","xyz")

    var fg = if("KSR" in names ) true else false
    println("$fg")

    //Ex5 lambda with When
    var result = calculateGrade
    println("${ result(70)}")

}
val calculateGrade = { grade:Int ->
    when(grade){
        in 0..40 -> "Fail"
        in 41..60 -> "Second"
        in 61..80 -> "First"
        in 81..100 -> "Distinc"
        else -> "Unknown"
    }
}