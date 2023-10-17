package com.kotlinpractises.generics
//Ex: Generic class constructor
/*
//Class constructor accept only  string param.
fun main(){
    MyGenClass("Hello")
   // MyGenClass(2)//Compile time Error
}
class MyGenClass(var str: String){
    init {
        print(str)
    }
}*/
//Generic class constructor
fun main() {
    var obj:MyGenClass<String> = MyGenClass<String>("Hello")
    var obj1:MyGenClass<Int> = MyGenClass<Int>(2)
}
class MyGenClass<T>(var str: T){
    init {
        print(str)
    }
}


