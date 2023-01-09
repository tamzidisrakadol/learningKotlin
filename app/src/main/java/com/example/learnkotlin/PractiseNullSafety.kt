package com.example.learnkotlin

//null safety
// "?" safe call operator
// "!!" not null assertion
//"?:" Elvis
//"?.let{...}" safe call with let


fun main(){
    var nullSafetyString:String? = "HelloKotlin"
    val elvisString:String? =null

    //safe call
    println("The length of the string is ${nullSafetyString?.length}")

    //safe call with let
    //it will only execute if the variable is not null
    nullSafetyString?.let {
        println("The  is $nullSafetyString")
    }

    //elvis
    //if not null execute code else print some non-null value
   /* val len=if (elvisString !=null){
        elvisString.length
    }else{
        -1
    }*/
    val length = elvisString?.length ?: -1
    println(length)


    //not null assertion
    //execute it when its surely not null otherwise it will throw exception
    println("The String is surely not null ${nullSafetyString!!.length}")

    var nSafeClass = NullSaferClass()

    //MUST HAVE TO INITIALIZE THE lateinit VAL OTHERWISE IT WILL THROW EXCEPTION
    nSafeClass.basketName = "Bucket list"
    nSafeClass.setup()

    val area1 = nSafeClass.pi*4*4
    println(area1)

}

class NullSaferClass{

    // lateinit variable must be var and also non null
    lateinit var basketName:String

    //"lazy" keyword is used for much less of memory \\ it can be also non null \\ it can be var or val
    val pi:Float by lazy{
        3.1416f
    }



    fun setup(){
        println("the name of the basket is $basketName")
    }
}