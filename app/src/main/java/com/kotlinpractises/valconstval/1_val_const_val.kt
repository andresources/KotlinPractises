package com.kotlinpractises.valconstval
const val a =10 // public static final int a = 10;
class ABC{
    val b = 20 //private final int b  = 20
    val z = f1() //Valid
    //const val y = f2() invalid
    companion object{
        //Const 'val' initializer should be a constant value
        //const val y = f2() invalid
        fun f2()  = 30
    }

    fun f1()  = 30
}
