package com.example.learnkotlin

fun main(){

    var myArray=Array<Int>(6){0}   //mutable fixed size
    myArray[0]=22
    myArray[1]=2
    myArray[2]=32
    myArray[3]=82
    myArray[4]=28

    println(myArray[5])
    println(myArray[2])

    for(elements in myArray){  //print all element in array
        print("$elements,")
    }
    println() // for space

    for (index in 0..myArray.size-1){  //print all the index number in list
        print("$index,")
    }


    println()

    var mylist = listOf<String>("Bangla","Mathematics","physics","chemistry")  // immutable list , fixed sized,read onlu


    for(elements in mylist){  //print all element in array
        print("$elements,")
    }
    println() // for space

    for (index in 0..mylist.size-1){  //print all the index number in list
        print("$index,")
    }

    println()

    //mutable kotlin collection -> arrayListOf , ArrayList , mutableListOf



    var myMutablelist = mutableListOf<String>("Bangla","Mathematics","physics","chemistry")  //mutable list, no fixed size, read & write

    myMutablelist.add("Biology")
    myMutablelist.remove("physics")
    myMutablelist.removeAt(0)

    for(elements in myMutablelist){  //print all element in array
        print("$elements,")
    }

    println()
    //map

    var myMap = mapOf<Int,String>(1 to "Super 4t",21 to "power4t", 155 to "Gulf mobil")  //immutable , fixed size , read only

    for(key in myMap.keys){
        println("Element at key: $key = ${myMap[key]}")
    }

    //mutable map series-> HashMap, hashMapOf, mutableMapOf

    var myMutableMap = HashMap<Int,String>()  //mutable , no fixed size , read & write
    myMutableMap.put(1,"Bangla 1st paper")
    myMutableMap.put(24,"English 1st paper")
    myMutableMap.put(5,"math 1st paper")
    myMutableMap.put(9,"Biology 1st paper")
    myMutableMap.put(122,"Social 1st paper")

    myMutableMap.remove(9)
    myMutableMap.put(20,"Business")


    for (key in myMutableMap.keys){
        println("$key ->  ${myMutableMap[key]}")
    }

    //set -> only print unique element


    var mySet = setOf<Int>(1,2,7,8,8,9,5,6,4,2,3,5,7,4) //immutable , read only , print as sequence
    for(elements in mySet){  //print all element in array
        print("$elements,")
    }
println()

    //mutable set series -> mutableSetOf, hashSetOf
    var myMutableSet = mutableSetOf<Int>(1,2,7,8,8,9,5,6,4,2,3,5,7,4) //mutable , read & write, print as sequence

    myMutableSet.add(122)
    myMutableSet.remove(8)


    for(elements in myMutableSet){  //print all element in array
        print("$elements,")
    }





}