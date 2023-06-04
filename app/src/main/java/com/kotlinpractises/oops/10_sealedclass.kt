package com.kotlinpractises.oops
//use case : https://medium.com/@kamilbekar/how-to-use-sealed-class-in-kotlin-f186c30a21e2
//https://proandroiddev.com/understanding-kotlin-sealed-classes-65c0adad7015
//https://betterprogramming.pub/how-to-use-kotlin-sealed-classes-for-state-management-c1cfb81abc6a
//https://www.kodeco.com/7547739-kotlin-and-android-beyond-the-basics-with-sealed-classes
//https://itnext.io/unlocking-the-power-of-sealed-classes-and-interfaces-in-kotlin-7f517732a2e8
//https://www.section.io/engineering-education/sealed-classes-in-kotlin/
//https://levelup.gitconnected.com/easily-manage-image-type-with-sealed-classes-4e361c6f4db9
sealed class EMP1{
    class HR(name: String) : EMP1(){
        fun f1() = "I am From HR Team."

    }
    class TECH : EMP1(){
        fun f2() = "I am From TECH Team"
    }
    class SECURITY : EMP1(){
        fun f3() = "I am From SECURITY Team"
    }
    //object NotAShape : Shape()
}

fun eval(e: EMP1){
    when(e){
        is EMP1.HR -> println("${e.f1()}")
        is EMP1.TECH -> println("${e.f2()}")
        is EMP1.SECURITY -> println("${e.f3()}")
    }
}

fun main(){
    var obj = EMP1.HR("KSR")
    eval(obj)
}