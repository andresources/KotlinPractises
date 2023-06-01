package com.kotlinpractises.scopedfun

// scope functions are used to execute a block of code within the scope of an object
//let is used in null safty , let execute block of the code if and only if the value not null, let is used with safe call operator(?.)

fun main(){
    basicLet()
    basicLet1()
    basicLet2()
    moreAboutLet()
}
fun basicLet(){
    //let -> input : it(object is refered by it)     ||       output :lambda

    class Emp{
        val name = "KSR"
    }

    var res = Emp().let { // Emp obj is ref by it
        "EMP Name : ${it.name}" //it is lambda result
              // OR
        return@let "EMP Name : ${it.name}"  //Improve Readability
    }

    println("Result : $res")

}

fun basicLet1(){
    // “it” can be renamed to a readable lambda parameter.
    class Emp{
         val name = "KSR"
    }

    var res = Emp().let { person -> //it renamed with readable lambda param
        return@let "EMP Name : ${person.name}"  //Improve Readability
    }

    println("Result : $res")

}

fun basicLet2(){
    val numbers = mutableListOf("One","Two","Three","Four","Five")
    numbers.map { it.length }.filter { it > 3 }.let {
        println(it)
    }
}

fun moreAboutLet(){
    //Ex1 : let with safe call operator(?.)
    var a : String? = null
    a?.let{//if a is null then this block will not executed
        println("Statement-1 : $it")
    }
    println("Statement-2")

    //Ex2: let, aslo
    var b = "Hello"
    //if b is not null then let and also block will excute
    b?.let {
        println("Statement-3 : $it")
    }?.also {
        println("Statement-4")
    }

    //Ex3: let, aslo and run
    var c = "Hello"
    //if c is null only "run" block execute, otherwise let and also block will execute
    c?.let{
        println("c - let block")
    }?.also {
        println("c - also block")
    }?: run{
        println("c - run block")
    }
}