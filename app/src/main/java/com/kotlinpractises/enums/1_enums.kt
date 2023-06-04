package com.kotlinpractises.enums
/*
//1. Defining Enums
enum class CardType{
    SILVER, //constants of enum class
    GOLD,
    PLATINUM
}
fun main(){
    println(CardType.SILVER.name) //name return SILVER
    println(CardType.SILVER.ordinal) //ordinal return 0
}
 */

//2.  Initializing Enum Constants
//Enums can have a constructor, since enum constants are instances of an Enum class.
//The constants can be initialized by passing specific values to the constructor.
/*enum class CardType(val color:String){
    SILVER("gray"),
    GOLD("yellow"),
    PLATINUM("black")
}

fun main(){
    println(CardType.GOLD.color) //yellow
}*/

/*enum class CardType(val discount:Float,val limit:Int){
    SILVER(0.12f,10000),
    GOLD(0.16f,20000),
    PLATINUM(0.18f,30000)
}

fun main(){
    println("Card Name : ${CardType.GOLD.name} Card Discount : ${CardType.GOLD.discount} Card Limit : ${CardType.GOLD.limit}")
}*/

//3.  Enum Constants as Anonymous Classes
/*enum class CardType{
    SILVER{
        override fun getDiscount() = 0.12f
    },
    GOLD{
        override fun getDiscount() = 0.14f
    },
    PLATINUM{
        override fun getDiscount() = 0.16f
    };
    abstract fun getDiscount() : Float
}

fun main(){
    println(CardType.PLATINUM.getDiscount())
}*/

//4. Enums implements Interfaces
/*interface IDiscount{
    abstract fun getDiscount() : Float
}
enum class CardType : IDiscount{
    SILVER{
        override fun getDiscount() = 0.12f
    },
    GOLD{
        override fun getDiscount() = 0.14f
    },
    PLATINUM{
        override fun getDiscount() = 0.16f
    }
}
fun main(){
    println(CardType.GOLD.getDiscount())
}*/

//5.  Static Methods
//To add a “static” function to an enum, we can use a companion object:
enum class CardType {
    SILVER,
    GOLD,
    PLATINUM;
    companion object {
        fun getDiscount(name: CardType) =
            when(name){
                 SILVER -> 0.12f
                 GOLD -> 0.14f
                 PLATINUM -> 0.16f
            }
    }
}

fun main(){
    println(CardType.getDiscount(CardType.SILVER))
}


