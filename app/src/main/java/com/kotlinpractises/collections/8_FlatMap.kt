package com.kotlinpractises.collections
data class MotorVehicle(val name: String,val model: Int, val manufacturer: String)
fun main(){
    val cars:List<MotorVehicle> = listOf<MotorVehicle>(
        MotorVehicle("Swift", 2016, "Maruti"),
        MotorVehicle("Altroz", 2020, "Tata"),
        MotorVehicle("Verna", 2019, "Hyundai")
    )

    val bikes:List<MotorVehicle> = listOf<MotorVehicle>(
        MotorVehicle("R-15", 2018, "Yamaha"),
        MotorVehicle("Gixxer", 2017, "Suzuki")
    )

    val vehicles = listOf<List<MotorVehicle>>(cars,bikes)
    val allVehicles = vehicles.flatMap {
        it
    }

    allVehicles.forEach {
        println("${it.name} - ${it.manufacturer}")
    }

    //Only manufactures details
    val all_manufactures = allVehicles.map {
        it.manufacturer
    }

    all_manufactures.forEach {
        println("Manufacture - ${it}")
    }
}