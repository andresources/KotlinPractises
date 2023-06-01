package com.kotlinpractises.oops
class OuterClass{
    val b =20
    class NestedClass{ //class declared in side a class called Nested Class, nested class by default static class
        val a = 10
        fun display(){
            //println("$b") can not access Outer Class members or fun inside Nested Class
        }
    }
    inner class InnerClass{ //class declared in side a class with key word inner called Inner Class,
        fun display(){
            println("$b") //********** can  access Outer Class members or fun inside Nested Class
        }
    }
}

fun main(){
    val res = OuterClass.NestedClass().a ///******create object for only nested class
    println("$res")

     OuterClass().InnerClass().display() //******create object for both inner and outer class

}