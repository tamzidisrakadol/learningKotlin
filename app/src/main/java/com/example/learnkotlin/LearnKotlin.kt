package com.example.learnkotlin

// kotlin main function
fun main(){
    //var & val is used for storing the value of variable
    //var is changeable / mutable
    //val is unchangeable/ immutable
    var myName = "Adol"

    val allAge:Int
    allAge = 25

    //type conversion
    val x = 5;
    val niceName:String = x.toString()

    val changeName ="kotlin"

    var normalString = "Hello everyone"

    val charStrlen = normalString[normalString.length-2]

    val lenOfStr = normalString.length

    //if..else statements as expressions (assign a value to a variable and return it)
    val greetings = if (allAge>20){
        "You are old enough"
    } else {
        "you are not old enough"
    }
    println(greetings)



    //kotlin When statement \/ same as java switch
    val day = 4;
    val resultDay = when(day){
        1 -> "Sun"
        2 -> "Mon"
        3 -> "Tues"
        4 -> "Wed"
        5 -> "Thur"
        6 -> "Fri"
        7 -> "Sat"
        else -> "invalid date"
    }

    println(resultDay)


    //$ -> adding two String
    println("hello $changeName")

    //get the char of string
    println(charStrlen)

    //get the length of string
    println(lenOfStr)

    println(allAge)

    //get the value by type conversion
    println(niceName)

    //comparing string-> if output 0 it means they are equal
    println(myName.compareTo(changeName))

    println(allAge<x)


    //creating array
    val cars = arrayOf("volvo","tata","hino","scania","hyundai")

    //use joinToString for formatting output
    println(cars.joinToString(separator = " | ", prefix = "[ ", postfix = " ]"))
    println(cars[3])//get the value at index of 3

    cars[2] ="Hino 1j"
    println(cars[2])//change the change at index of 2

    println(cars.size)//get total list size

    //checking an element in array
    if ("Mercedes" in cars){
        println("It exists!")
    }else{
        println("not exists!")
    }

    //loop through all element in array (per line) \\ for  in
    for (x in cars){
        println(x)
    }

    //loop through all element in array (single line) by string builder\\ for each
    val builder = StringBuilder()
    cars.forEach { allcarName->
        builder.append(allcarName).append(",")
    }
    val results  = builder.toString().trimEnd(',',' ')
    println(results)

    // kotlin range
    val anotherBuilder = StringBuilder()
    for (nums : Int in 5..60){
        anotherBuilder.append(nums).append(",")
    }
    var numResult = anotherBuilder.toString().trimEnd(',',' ')
    println(numResult)


    var newsfun = newFunction(2,3)
    println(newsfun)

}


//creating function in kotlin
// :Int -> return type || if there is no return it means void

fun newFunction(x:Int, y:Int):Int{
    return x+y
}

