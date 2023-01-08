package com.example.learnkotlin

//high level function -> can accept function as a parameter \ can return a function \ can do both
//lambdas -> it just a function with no name


fun main(){

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
//    program.multiplyNumber(8,9) { x, y -> x * y }



    program.multiplyNumber(5,6,::multiplication)
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
}


interface MyInterface{
    fun execute(sum:Int)
}