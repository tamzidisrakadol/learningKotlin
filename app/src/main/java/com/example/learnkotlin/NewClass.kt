package com.example.learnkotlin

open class NewClass(var band : String, var year : Int, var model: String ) {

    var founder = "Steve Jobs"

    fun drive(){
        println("vromm!!")
    }

    fun speedCollection(maxSpeed: Int){
        println("max speed of $model is $maxSpeed")
    }

}