package com.kotlinpractises.javainteroperability

data class JVMFieldDataClass(@JvmField val a:Int,@get:JvmName("myBValue")val b:String)
