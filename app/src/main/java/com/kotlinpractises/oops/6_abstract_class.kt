package com.kotlinpractises.oops

abstract class MyAbstract{
    //A class which is declared with abstract keyword is known as abstract class.
    //An abstract class cannot be instantiated. Means, we cannot create object of abstract class.
    //Abstract class or abstract function does not need to annotate with open keyword as they are open by default.
    var a = 10
    abstract fun f1() //Abstract fun : means function without body. Must be override in it's implementation class(derived class)
    open fun f2(){ //Non-Abstract fun : means function with body. Optional to override in it's implementation class
        //if you want to override non-ab. in its derived class,fun. must be annotated with open key word
        println("MyAbstract - f2")
    }

    fun f3(){
        println("MyAbstract - f3")
    }
}

class MyDerivedClass : MyAbstract(){
    override fun f1() {
        println("MyDerivedClass - f1")
    }

    override fun f2(){
        super.f2()//used to call MyAbstract f2 method
        println("MyDerivedClass - f2")
    }
}

fun main(){
    var obj = MyDerivedClass()
    obj.f1()
    obj.f2()
    obj.f3()
}