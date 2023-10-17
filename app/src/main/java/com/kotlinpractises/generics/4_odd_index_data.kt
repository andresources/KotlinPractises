package com.kotlinpractises.generics
//class constructor take list as input and print odd indexed data
class MyList<T>(var list:List<T>){
    operator fun invoke(){
        list.filterIndexed { index, _ ->
            index % 2 ==0
        }.let {
            it.takeIf { it.size >0 }.let {
                print(it)
            }
        }
    }
}

fun main(){
    var list:List<String> = listOf("Android","java","Kotlin")
    var obj = MyList<String>(list)
    obj()
}
