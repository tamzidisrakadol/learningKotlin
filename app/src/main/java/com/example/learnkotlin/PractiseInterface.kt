package com.example.learnkotlin

fun main(){

    val remote = RemoteClick("TvRemote")
    remote.onClickMethod()
    remote.onLongTapMethod()
    println(remote.instrumentName)

}


interface ClickListener{
    val instrumentName:String  //by default abstract open

    fun onClickMethod()        //abstract method should not have body

    fun onLongTapMethod(){          //normal method
        println("long press is enabled")
    }
}



class RemoteClick(val rName:String) : ClickListener{    //interface will not have a constructor
    override val instrumentName: String = rName


    override fun onClickMethod() {
        println("$rName is clicked in single tap")
    }

    override fun onLongTapMethod() {
        super.onLongTapMethod()   //calling the superclass
    }

}


