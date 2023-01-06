package com.example.learnkotlin

data class PractiseKotlin(var id: Int, var name: String)


fun main() {
    val user = PractiseKotlin(1, "Micheal")
    println(user.name)

    val user2 = PractiseKotlin(2, "Piyush")
    println(user.equals(user2))

    println("user details: $user")


    val updateUser = user.copy(name = "Micheal Jackson")
    println(user)
    println(updateUser)

    val (id, name) = updateUser
    println("$id , $name")

    println(updateUser.component1())
    println(updateUser.component2())
}
// data class is used for comparing object
//it can used for copy the value from another object
//it can print to-string
//data class only takes val or var properties in primary constructor

