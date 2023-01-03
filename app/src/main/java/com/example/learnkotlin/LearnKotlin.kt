package com.example.learnkotlin

import java.util.*

// kotlin main function
fun main() {
    //var & val is used for storing the value of variable
    //var is changeable / mutable
    //val is unchangeable/ immutable
    val myName = "Adol"

    val allAge: Int
    allAge = 25

    //type conversion
    val x = 5
    val niceName: String = x.toString()

    val changeName = "kotlin"

    val normalString = "Hello everyone"

    val charStrlen = normalString[normalString.length - 2]

    val lenOfStr = normalString.length

    //if..else statements as expressions (assign a value to a variable and return it)
    val greetings = if (allAge > 20) {
        "You are old enough"
    } else {
        "you are not old enough"
    }
    println(greetings)


    //kotlin When statement \/ same as java switch
    val day = 4
    val resultDay = when (day) {
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

    //Kotlin when statement ex-2
    val season = 3
    when (season) {
        1 -> println("Summer")
        2 -> println("Monsoon")
        3 -> {
            println("Autumn")
            println("Late Autumn")
        }
        4 -> println("Winter")
        else -> println("no valid season")
    }
    //kotlin when statement with range ex-3
    var month = 4
    when (month) {
        in 3..5 -> println("Summer season")
        in 7..8 -> println("rainy season")
        in 9..12 -> println("winter season")
        1, 2 -> println("Autumn season")
        else -> println("Invalid Season")
    }

    //kotlin when statement with range ex-4
    val drinkAge = 15
    when (drinkAge) {
        !in 12..17 -> println("u are ineligible to drink ")
        in 18..70 -> println("U are old enough")
        else -> println("invalid age")
    }

    //kotlin when statement with range ex-5
    var xy: Any = "13.33F"
    when (xy) {
        is Int -> println("This is an Integer")
        !is Double -> println("this is a not Double value")
        is String -> println("This is a String")
        is Float -> println("this is a float value")
        else -> println("invalid type")
    }


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

    println(allAge < x)


    //creating array
    val cars = arrayOf("volvo", "tata", "hino", "scania", "hyundai")

    //use joinToString for formatting output
    println(cars.joinToString(separator = " | ", prefix = "[ ", postfix = " ]"))
    println(cars[3])//get the value at index of 3

    cars[2] = "Hino 1j"
    println(cars[2])//change the change at index of 2

    println(cars.size)//get total list size

    //checking an element in array
    if ("Mercedes" in cars) {
        println("It exists!")
    } else {
        println("not exists!")
    }

    //loop through all element in array (per line) \\ for  in
    for (x in cars) {
        println(x)
    }

    //loop through all element in array (single line) by string builder\\ for each
    val builder = StringBuilder()
    cars.forEach { allcarName ->
        builder.append(allcarName).append(",")
    }
    val results = builder.toString().trimEnd(',', ' ')
    println(results)

    // kotlin range
    val anotherBuilder = StringBuilder()
    for (nums: Int in 5..60) {
        anotherBuilder.append(nums).append(",")
    }
    var numResult = anotherBuilder.toString().trimEnd(',', ' ')
    println(numResult)


    //creating oject of Function
    var newsfun = newFunction(2, 3)
    println(newsfun)

    //creating object of NewClass
    var newClass = NewClass("japan", 2012, "Sujuki")
    var newClass2 = NewClass("malaysia", 2016, "Hero")

    println(newClass.band)
    println(newClass2.year)

    // get the function from NewClass
    println(newClass.drive())
    println(newClass2.speedCollection(200))

    //kotlin inheritance
    val parentClass = ParentClass()
    println(parentClass.myNewFunction())


    val str1 = "Hello "
    val str2 = "Motooo "

    val str3 = "whooo "
    println(str3.add(str1, str2))


    val xRow = 6
    val yCol = 10

    val greatVal = xRow.greaterValue(yCol)
    println(greatVal)


    val person = Person("Tamzid", "Israk")

    person.stateHobby()

    //overridden the hobby property in person class
    person.hobby = "playing Cricket"
    person.stateHobby()

    //2nd constructor
    var secPerson = Person("Adol", "Israk", 22)

    var carStat = Car()
    println(carStat.myBrand)

    carStat.maxSpeed = 600
    println(carStat.maxSpeed)
    println(carStat.myModel)


}

fun String.add(s1: String, s2: String): String {
    return this + s1 + s2
}


fun Int.greaterValue(other: Int): Int {
    if (this > other) {
        return this
    } else
        return other
}

//creating function in kotlin
// :Int -> return type || if there is no return type then it means void
fun newFunction(x: Int, y: Int): Int {
    return x + y
}




class Person(fName: String, lName: String) {

    //properties
    var age: Int? = null
    var hobby = "Watching netflix"
    var fName:String? = null

    //initializer
    init {
        this.fName = fName
        println("my First name is $fName and last name is $lName")
    }

    //2nd constructor
    constructor(fName: String, lName: String, age: Int)
            : this(fName, lName) {
        this.age = age

        println("2nd person  First name is $fName and last name is $lName and age is $age years old")
    }

    //method
    fun stateHobby() {
        println("$fName\'s hobby is $hobby")
    }
}

class Car{
    lateinit var owner:String

    //private setter
    var myModel = "m5"
        private set


    init {
        this.myModel ="m5"
        this.owner ="Mr.Adol"
    }

    //custom getter
    val myBrand:String = "BMW"
    get(){
        return field.lowercase(Locale.getDefault())
    }

    //custom setter
    var maxSpeed : Int = 200
    set(value) {
        field=if (value>0) value else throw java.lang.IllegalArgumentException("max speed should be more than 0")
    }




}

