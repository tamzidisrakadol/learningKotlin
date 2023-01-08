package com.example.learnkotlin

fun main(){

    val tile1= Red("Corn",30)
    val tile2 = Blue(25)
    println(tile1.type)
    println(tile2.points)

    val titlePoint: Tile = Red("Corn Soup",200)

    val pointTaken = when(titlePoint){    // restricted the type can take any
        is Blue -> titlePoint.points * 7
        is Red -> titlePoint.points *2
    }
    println(pointTaken)

}


sealed class Tile
class Red(val type:String,val points:Int):Tile()
class Blue(val points: Int):Tile()





//sealed class is an abstract class and cannot create object
//able to create an object inside the sealed class
// advantage -> code will execute with every case there is no room for else block