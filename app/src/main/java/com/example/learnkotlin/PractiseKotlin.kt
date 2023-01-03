package com.example.learnkotlin

data class PractiseKotlin(val id: Int, var name:String)


fun main(){
      val user = PractiseKotlin(1,"Micheal")
        println(user.name)

    val user2 = PractiseKotlin(2,"Piyush")
    println(user.equals(user2))

    println("user details: $user")


    val updateUser = user.copy(name = "Micheal Jackson")
    println(user)
    println(updateUser)

    println(updateUser.component1())
    println(updateUser.component2())

    val(id,name)= updateUser
    println("$id , $name")

}