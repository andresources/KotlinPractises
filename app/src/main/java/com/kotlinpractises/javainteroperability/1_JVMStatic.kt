package com.kotlinpractises.javainteroperability

object AppConstants{
    //@JVMStatic works in only Object and Companion Class
    @JvmStatic
    fun f1(){
         //In Java,without @JVMStatic we have to call "AppConstants.INSTANCE.f1()"

    }
}

class AppConst{
    //@JVMStatic works in only Object and Companion Class
    companion object{
        @JvmStatic
        fun f2(){

        }
    }
}