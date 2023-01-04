package com.example.learnkotlin

fun main(){
    val doggy = Dog("orange","pug")
    doggy.AnimalSound()

}

open class Animal{  //super class

    var color:String=""


    constructor(color: String){
        this.color = color

        println("From 2nd constructor animal color is $color")
    }

    open fun AnimalSound(){
        println("Animal sound is different")
    }

}


class Dog:Animal{  //subclass
    var breed:String ="golden"

    init {
        println("Dog color is $color and breed is $breed")
    }


    constructor(color: String, breed : String):super(color){
        this.breed = breed
        println("From 2nd constructor dog color is $color & $breed")

    }

    override fun AnimalSound() {
        super.AnimalSound() // it will print the function from superclass
        println("Dog sound barks") //it will override the method
    }

}


// in the constructor of class if we not set var and val then it will count as parameter
// if we set it as var or val then it will count as properties
