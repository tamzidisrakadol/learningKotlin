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

    println()



    val manyNum = arrayOf(22,33,44,55,66,77,88,99,9999)
    println(manyNum.contentToString())


    //filtering list
    var newNumList = listOf<Int>(8,2,6,77,88,25)

    // it will filter the list and return all the number which is less than 10 \\ filter takes lambda expression
    //replace with "it" keyword  { v->v<10} as it contains only one parameter
    val mySmallList = newNumList.filter { it<10}

    println(mySmallList)

    //map -> transform the list
    val squaredList = newNumList.map { it*it }  //{num-> num*num}
    println(squaredList)

    //filter + map
    val smallSquaredList = newNumList.filter { it<10}.map { it*it}
    println(smallSquaredList.sorted()) //print the list with sorted

    var people= mutableListOf<ContactPerson>()
    people.add(ContactPerson("Sneha",22))
    people.add(ContactPerson("Rahul",23))
    people.add(ContactPerson("Rishi",24))
    people.add(ContactPerson("Rafi",25))
    people.add(ContactPerson("Israk",26))
    people.add(ContactPerson("Shuvo",27))
    people.add(ContactPerson("Jolly",28))
    people.add(ContactPerson("Nahid",29))



    var filterContactList = people.filter { it.pName.startsWith("R")}.map { it.pName }
    println(filterContactList)



    // predicates -> "all","any","count","find" = Boolean result
    val predicateList = listOf<Int>(7,9,77,45,26,68,85,96,12,24,45)

    val check1 = predicateList.all { it>10}   // check if all elements are greater than 10 ?
    println(check1)

    val check2=predicateList.any { it < 10 }   // check if there any elements are smaller than 10?
    println(check2)

    val check3 = predicateList.count{it<10}  // check how many element are less than 10
    println(check3)

    val check4 = predicateList.find {20<=it }  //check all the element and print the first element which is less than 30
    println(check4)






}

data class ContactPerson(var pName:String, var pNUm:Int)