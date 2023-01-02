package com.example.learnkotlin

// kotlin main function
fun main(){
    //var & val is used for storing the value of variable
    //var is changeable / mutable
    //val is unchangeable/ immutable
    var myName = "Adol"

    val changeName ="kotlin"

    var normalString = "Hello everyone"

    val charStrlen = normalString[normalString.length-2]

    val lenOfStr = normalString.length

    //$ -> adding two String
    println("hello $changeName")
    println(charStrlen)
    print(lenOfStr)
}

