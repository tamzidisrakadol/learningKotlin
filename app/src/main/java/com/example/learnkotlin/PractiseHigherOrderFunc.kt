package com.example.learnkotlin

//high level function -> can accept function as a parameter \ can return a function \ can do both
//lambdas -> it just a function with no name


fun main(){
    var divide = 0
    val program=Program()
    program.addTwoNumber(5,6, object :MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }

    })


    val myLambda:(Int,Int) -> Int = {x:Int,y:Int -> x*y}  // lambda expression


    fun multiplication(a:Int,b:Int):Int{            // normal function without lambda
        return a*b
    }

    program.multiplyNumber(8,9,myLambda)

    //lambda expression on different approach but result will remain same
    //program.multiplyNumber(8,9,{x,y->x*y})
    //program.multiplyNumber(8,9) { x, y -> x * y }



    program.multiplyNumber(5,6,::multiplication) // " :: " -> to call function

    program.divideNumber(100,4){x,y->divide=x/y}  //closures -> in kotlin outside properties of lambda can be modified
    println(divide)

    program.reverseName("Kotlin") { it.reversed() }  // lambda expression with it if there is single parameter \\ same as-> { s -> s.reversed() }
}


class Program{
     fun addTwoNumber(a:Int , b:Int,action:MyInterface){
         val sum = a+b
         action.execute(sum)
     }


    fun multiplyNumber(p:Int, q:Int, action:(Int,Int)->Int){    //Higher order function
        var multiResult = action(p,q)
        println(multiResult)
    }

    fun divideNumber(e:Int,f:Int,division:(Int,Int)->Unit){
        division(e,f)
    }

    fun reverseName(str:String,myFunct:(String)->String){  //higher order function
        var revResult = myFunct(str)
        println(revResult)
    }
}


interface MyInterface{
    fun execute(sum:Int)
}