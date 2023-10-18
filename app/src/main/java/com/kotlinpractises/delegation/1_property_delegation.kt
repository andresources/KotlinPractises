package com.kotlinpractises.delegation

import kotlin.reflect.KProperty

/*To implement a property delegate, you need to define a class with getValue() and setValue() functions,
  and then use the "by" keyword to delegate your property to an instance of that class.
*/

class MyDelegate{
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "Hello, I'm a delegated property!"
    }
}

class MyDClass{
    val name: String by MyDelegate()
}

fun main(){
    var res = MyDClass().name
    println(res)
}