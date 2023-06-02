package com.kotlinpractises.string

fun main(){
    //
    val str = "<<<First Grade>>>"
    println(str.take(8)) //take first 8 char -> O/P : <<<First
    println(str.takeLast(8)) //take last 8 char -> O/P : Grade>>>
    println(str.takeWhile { !it.isLetter() }) // <<<
    println(str.takeLastWhile { !it.isLetter() }) // >>>

    println(str.filter { !it.isLetter() }) //<<< >>>
    /*
    filter vs takeWhile
    filter will iterate through whole input iterator while takewhile will break once the predicate turn False
     */
    val path = "http://server.com/HELLO.MP3"
    println(path.takeLastWhile{
        it !==  '.'
    })

    val protocal = path.takeWhile {
        it !== ':'
    }
    println("Used protocal $protocal")

    //Ex1: MyDialog
    class MyDialog{
        var bg: Boolean = true
        var age = 10
        fun display(){
            println("Display fun")
        }
    }

    var dig : MyDialog? = MyDialog()

    if (dig!=null && dig.bg&&dig.age ==10){
        dig.display()
    }else{
        println("My Dialog is empty")
    }

    dig?.takeIf {
        it.bg && it.age==10
    }?.display() ?: run{
        println("My Dialog is empty")
    }

    //Ex2:
    val input = "Kotlin"
    val keyword = "in"
    val index = input.indexOf(keyword).takeIf { it >= 0 } ?: 0

    println("*".repeat(index))

    //In Android
    //val outDirFile = File(outputDir.path).takeIf { it.exists() } ?: return false
}