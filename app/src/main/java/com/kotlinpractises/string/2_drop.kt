package com.kotlinpractises.string

fun main(){
    var stdName = "KSR"
    println(stdName.drop(1))//O/P SR  : drop first n char
    println(stdName.dropLast(1)) //O/P KS

    val chars = ('a'..'z').toList()
    println(chars.drop(23)) // [x, y, z]
    println(chars.dropLast(23)) // [a, b, c]
    println(chars.dropWhile { it < 'x' }) // [x, y, z]
    println(chars.dropLastWhile { it > 'c' }) // [a, b, c]

    val mUrlPath = "http://server.com/test.png"
    println(mUrlPath.dropWhile {
        it !== ':'
    }) //://server.com/test.png
    println(mUrlPath.dropLastWhile {
        it !== '.'
    })//http://server.com/test.


    var l1 = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(l1.dropWhile { it % 2 ==1 }) //[2, 3, 4, 5, 6, 7, 8, 9, 10]

    var nList = listOf<String>("KSR","bhav","abc","bc")
    println(nList.dropLastWhile {
            it.startsWith("b")
    }) //[KSR, bhav, abc]


}