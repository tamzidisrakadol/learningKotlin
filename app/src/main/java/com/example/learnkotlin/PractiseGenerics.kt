package com.example.learnkotlin


//normal function
class Container( var capacity:Int){
    fun setValue(value:Int){
        capacity=value
    }
    fun getValue():Int{
        return capacity
    }

    // it can store same type multiple value and make it as array \ "vararg" keyword
    fun addVarargNumber(vararg longValue:Int){
        var sum = 0
        for(i:Int in longValue){
            sum += i
        }
        println(sum)
    }
}

//function with Generics
// we will set the Class type function type after calling object
class GContainer<T>(var itemCapacity:T){
    fun setValue(value:T){
        itemCapacity=value
    }

    fun getValue():T{
        return itemCapacity
    }
}


fun main(){
    val obj = Container(300)
    println( obj.getValue())

    val gObj = GContainer<Int>(500)
    println( gObj.getValue())

    val sObj = GContainer<String>("I am beginner in kotlin")
    println( sObj.getValue())

    //storing multiple values
    obj.addVarargNumber(1,2,3,4,5,6,7,8,9)

}