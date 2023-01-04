package com.example.learnkotlin

class Dairy(){
    var dName:String ="Friday"
    var dPage:Int=500

    var dChapter:String =""
    var dImages:Int = 0


    fun diaryDesc(){
        println("the $dName has $dPage pages")
    }
}



fun main(){


    //scope function "With" keyword
    val dairy = Dairy()
    with(dairy){
        println(dName)
        println(dPage)
    }

    //also can return value as the lambda result
    val dCollection:Int = with(dairy){
        println(dName)
        println(dPage)
        dPage+200
    }
    println("Dairy collection has total $dCollection page")



    //scope function with "apply" keyword
    val pDairy = Dairy().apply {
        dChapter = "The White Palace"
        dImages = 1500

    }
    with(pDairy){
        println(dChapter)
        println(dImages)
    }


}