package com.kotlinpractises.javainteroperability

class NormalClass {


    companion object{
        @JvmField
        var a =10
        @JvmStatic
        fun f2(){

        }
    }

    var b =20

    fun f1(){

    }

    @JvmName("myNewFun")
    fun f3(){

    }

}