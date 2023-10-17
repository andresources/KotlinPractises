package com.kotlinpractises.generics
//IN : to specify a generic type is an "input" type, used as a input argument for the function
//OUT: to specify a generic type is an "output" type, used as a output argument for the function
//Where : The where keyword is used to specify constraints on the types that can be used as arguments or return types.
fun main(){
    //---------------- In -------------------------------
    val stringConsumer = StringConsumer()
    stringConsumer.consume("Hello")

    val anyConsumer: Consumer<Any> = AnyConsumer()
    anyConsumer.consume("Hello")
    anyConsumer.consume(10)
    //---------------- In -------------------------------


    //---------------- Out -------------------------------
    val stringProducer = StringProducer()
    println(stringProducer.produce()) // prints "Hello"

    val anyProducer: Producer<Any> = AnyProducer()
    println(anyProducer.produce()) // prints "Hello"

    val stringProcessor:Processor<String>  = StringProcessor()
    println(stringProcessor.process("Hello"))//
}
//---------------- In -------------------------------
interface Consumer<in T> {
    fun consume(item: T)
}

class StringConsumer : Consumer<String>{
    override fun consume(item: String) {
        println("Consuming $item")
    }
}

class AnyConsumer : Consumer<Any>{
    override fun consume(item: Any) {
        println("Consuming $item")
    }
}
//---------------- In -------------------------------

//---------------- Out -------------------------------
interface Producer<out T> {
    fun produce(): T
}

class StringProducer : Producer<String> {
    override fun produce(): String = "Hello"
}

class AnyProducer : Producer<Any> {
    override fun produce(): Any = "Hello"
}

//---------------- Where -------------------------------
interface Processor<T> where T : CharSequence, T : Comparable<T> {
    fun process(value: T): Int
}

class StringProcessor : Processor<String> {
    override fun process(value: String): Int = value.length
}
