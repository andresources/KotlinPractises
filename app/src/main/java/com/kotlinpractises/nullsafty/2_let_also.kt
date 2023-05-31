package com.kotlinpractises.nullsafty

fun main(){
    //Ex1
    var str: String? = "Hello"
    str?.let{
        println("Length : ${str.length}")//Show RecylerView
    }?.also {
        println("STR : ${str}") //Hide Nodata View
    }?:run{
        println("STR Is Empty") //Hide Recy,ShowTextViews
    }

    //Ex2 multiple chain calls:
    data class City(val cityName: String?, val cityCode: String?)
    data class Country(val city: City?)

    var country: Country? = Country(City("Hyd",null))
    var code = country?.city?.cityCode?.let {
        it.length
    }?.also{
        println("City Code : $it")
    }?: -1

    println("$code")


}