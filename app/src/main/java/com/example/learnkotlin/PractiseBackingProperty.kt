package com.example.learnkotlin

class Human {
    private var _age: Int = 0

    var age: Int
        get() {
            return _age
        }
        set(value) {
            _age = value
        }


    private var _hobbies= mutableListOf<String>()

    val hobbies:List<String>
        get()=_hobbies

    fun addHobby(hobbyName:String){
        _hobbies.add(hobbyName)
    }

}

fun main(){
    val human = Human().apply {
        age=18
    }

    println("the Man age is ${human.age} and legal to vote")

    human.addHobby("gardening")
    human.addHobby("Stamp Collection")
    human.addHobby("coin Collection")
    human.addHobby("Book reading")
    human.addHobby("Pen collection")

    println(human.hobbies)
}


//using backing property increase security, more encapsulate data