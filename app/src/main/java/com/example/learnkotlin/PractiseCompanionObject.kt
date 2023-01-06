package com.example.learnkotlin



// java static -> kotlin "object" class
// declaring object cannot create constructor
//object class can be sub class
//object class can have properties, method, init

object Customer:MySuperClass(){
    var customerId:Int =-1
    var customerName:String =""

    fun typeOfCustomer():String{
        var line:String="$customerName are welcome to our store"
        println(line)
        return line
    }

    override fun changeCustomerName(name: String) {
        println("$customerName name should be changed as $name")
    }


}


fun main(){
    Customer.customerId = 100
    println(Customer.customerId)

    Customer.customerName="Adol"
    println(Customer.customerName)
    Customer.typeOfCustomer()



    Customer.customerName="MOCCO"
    Customer.typeOfCustomer()


    Customer.changeCustomerName("Ross")

    BookCustomer.bCusomterID=200
    println(BookCustomer.bCusomterID)


    BookCustomer.wishingBookCustomer()

}



open class MySuperClass() {
    var name:String=""

    open fun changeCustomerName(name: String){
        println("$name should be changed")
    }
}



class BookCustomer{
     companion object{

      var  bCusomterID:Int=-1

         fun wishingBookCustomer():String{
             var line = "BookCustomer are welcome"
             println(line)
             return line
         }
     }
}


