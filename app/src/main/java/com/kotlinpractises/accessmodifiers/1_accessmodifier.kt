package com.kotlinpractises.accessmodifiers

//private,public,internal,protected  Default public
open class Base{
    protected val a = 10
    protected val b =20
    private val c =20
}
class Sub : Base(){
    init {
        val c = a + b
    }
}
fun main(){

}
