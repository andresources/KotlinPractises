package com.kotlinpractises.javainteroperability

class MyStudent @JvmOverloads constructor(var sname:String,var sclass:String,var school:String="NJS"){ //school is default param

}

fun main(){
    MyStudent("KSR","UKG")
    MyStudent("KSR","UKG","NJS")
}