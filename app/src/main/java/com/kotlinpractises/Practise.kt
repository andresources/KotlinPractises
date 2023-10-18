package com.kotlinpractises
fun main(){
    print(sumOfTwo(10,20,calCulate))
}

val calCulate: (a:Int,b:Int) -> Int = { x1, y1 ->
     x1 + y1
}

fun sumOfTwo(a:Int,b:Int,calCulateTmp: (a:Int,b:Int) -> Int) = calCulateTmp(a,b)





