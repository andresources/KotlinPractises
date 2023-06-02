package com.kotlinpractises.functions
fun main(){//*****A function is a data type in kotlin
    //Ref : https://developer.android.com/codelabs/basic-android-kotlin-compose-function-types-and-lambda#3
    //We can store a function in another variable
    //Ex1 -> with :: function reference operator
    var displayVariable = ::displayMessage//:: function reference operator
    displayVariable()

    //Ex2 ->without :: with No args
    var displayVariable1 = displayMessage1//:: function reference operator
    displayVariable1()

    //Ex3 ->without :: with Args
    var addFun = addTwoNumbers
    var res1:Int = addFun(1,2)
    println("Result : $res1")

    //Ex4
    val disPlay = {  -> println("Hello") }
    disPlay()

    //Ex5
    //Lambda is fun. without name.
    //Define Lambda using {}
    //a:Int  , b:Int ->Params
    //After -> fun. body
    val myFun = {a:Int  , b:Int -> a+b}
    val res = myFun(2,3)//fun calling
    println("Res: $res")

    //Ex6
    val myRes = addTwoNumbersShotHand
    println("${myRes(100,200)}")


    var result = calculateGrade
    println("${ result(70)}")

}

fun displayMessage(){
    println("Hello Lambda...")
}

var displayMessage1:() -> Unit = { //or displayMessage1 (Takes no args and return nothing)
    println("Hello Lambda...")
}

var addTwoNumbers: (a:Int,b:Int) -> Int = { num1,num2 ->
    num1 + num2
}

var addTwoNumbersShotHand = { num1:Int,num2:Int ->
    num1 + num2
}

val calculateGrade = { grade:Int ->
    when(grade){
        in 0..40 -> "Fail"
        in 41..60 -> "Second"
        in 61..80 -> "First"
        in 81..100 -> "Distinc"
        else -> "Unknown"
    }
}