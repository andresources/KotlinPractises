package com.kotlinpractises.oops

interface MyInterface{ // To achive multiple inheritace : class a: i1,i2.....
    //By defalut all members and fun are annoted with open,
    abstract fun f11()
    fun f12(){ //No need to use open key word, But in Abstract class must be annoted with open key word

    }
}

class MyDerivedClass1 : MyInterface{
    override fun f11() {

    }

    override fun f12() {

    }

}