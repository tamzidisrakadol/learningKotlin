package com.example.learnkotlin

fun main(){
    var phone = Oppo()
    println(phone.modelName)
    phone.supportAndroid()
    phone.cameraOption(50)

}



abstract class PractiseAbstract {
    abstract var modelName:String

    abstract fun supportAndroid()
    open fun cameraOption(megapixel: Int){
        println("mobile camera is $megapixel")
    }

}

class Oppo():PractiseAbstract(){
    override var modelName: String ="OPPO f16"

    override fun supportAndroid() {
       println("Support android Functionality")
    }

    override fun cameraOption(megapixel: Int) {
        println("$modelName camera is $megapixel")
    }

}

//cannot create object of Abstract class
//cannot give body  to property or method of abstract class
//abstract is open by default
//abstract function or property should must be implemented