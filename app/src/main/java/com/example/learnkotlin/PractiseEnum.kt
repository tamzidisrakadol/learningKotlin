package com.example.learnkotlin

interface cashBackPolicy{
    fun getCashBackValue():Float
}

//enum class with properties, with interface


enum class DebitCardType(val color:String,val limit:Int):cashBackPolicy{
    SilverDebitCard("grey",200000){
        override fun getCashBackValue(): Float {
            return 0.2f
        }
                                  },
    GoldDebitCard("goldenColor",10000000){
        override fun getCashBackValue(): Float {
        return 0.5f
        }
                                         },
    PlatinumDebitCard("Matt Black",5000000){
        override fun getCashBackValue(): Float {
            return 0.25f
        }
    }
}


enum class CreditCardType{
    Silver,
    Gold,
    Platinum
}

fun main(){

    val creditCardType:CreditCardType = CreditCardType.Gold

    println(creditCardType.ordinal)  // index
    println(creditCardType.name)


    val myAllCardType: Array<CreditCardType> =CreditCardType.values()     //alt+enter=specify type explicitly

    // to get all the values in enum class
    myAllCardType.forEach {
        println(it)
    }

    when(creditCardType){
        CreditCardType.Silver -> println("You have Silver credit card")
        CreditCardType.Gold -> println("you have gold credit card")
        CreditCardType.Platinum -> println("you have platinum credit card")
    }

    println(DebitCardType.GoldDebitCard.getCashBackValue())
    println(DebitCardType.PlatinumDebitCard.color)
}