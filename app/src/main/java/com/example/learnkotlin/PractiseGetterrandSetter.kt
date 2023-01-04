package com.example.learnkotlin

import java.util.*

fun main() {

    val pra = PractiseGetterrandSetter("Cheese Book", 2000)
    pra.lateMessage = "ADOL POKE"
    pra.cheeseSetter()
    println(pra.bPrice)
    pra.bPrice = -2000
    println(pra.bName)


}


class PractiseGetterrandSetter(bookName: String, bookPrice: Int) {

    //custom Getter
    var bName: String = bookName
    get() {
        return field.uppercase()
    }

    //custom setter for not getting negative number
    var bPrice: Int = bookPrice
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("price cannot be negative")
            }
        }

    //lateinit must be var and should must call later and it can be only String
    lateinit var lateMessage: String


    fun cheeseSetter() {
        println(" $lateMessage is called")
    }


}