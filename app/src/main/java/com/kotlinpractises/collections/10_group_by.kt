package com.kotlinpractises.collections

fun main(){
    //Ex:1
    var list = listOf<String>("One","oo","t","t1")
    var mp = list.groupBy {
        it.first().lowercase()
    }
    for(key in mp.keys){
        println("----- Start with ${key} ------")
        mp.get(key)?.forEach {
            println("$it")
        }
    }

    //Ex:2 :group by status
    data class Task(val name:String,val status:String)
    var tasks = listOf<Task>(
        Task("Task1","Completed"),
        Task("Task2","Completed"),
        Task("Task3","In-Progress"),
        Task("Task4","In-Progress"),
        Task("Task5","Not-Started")
    )

    var task_list=tasks.groupBy {
        it.status
    }

    for (key in task_list.keys){
        println("------ $key -----")
        task_list.get(key)?.forEach {
            println("${it.name}")
        }
    }

}