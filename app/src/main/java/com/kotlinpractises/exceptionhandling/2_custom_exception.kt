package com.kotlinpractises.exceptionhandling

fun main(){ //thow is used to thow an exception explicitly
    val age = 10
    try {
        if(age > 18) println("Valid User") else throw InvalidAgeException("Invalid User")
    }catch (e:InvalidAgeException){
        println(e.message)
    }


}

class InvalidAgeException(message: String) : Exception(message)
