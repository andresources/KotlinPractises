package com.kotlinpractises.nullsafty
data class Locatity(var district:String?,var city:String?,var pincode:String?)
fun main(){
  //1. Safe call(?.) ->syntax: variable?.(property/method())
  var str1:String? = null
  var l1 = str1?.length
  println(l1) //null

  //2. Safe call(?.) with elvis operator(?:) to provide default value
  var str2:String? = null
  var l2 = str2?.length?:"No Data"
  println(l2) //No Data

  //3. Safe call(?.) with let operator and elvis operator(?:)
  var str3:String? = null
  var l3 = str3?.let { it.length }?:-1
  println(l3)

}