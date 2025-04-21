package com.example.a1stapplication

    //Kotlin has two types of lists
    //1. immutable lists (cannot be modified) and
    //2. mutable lists (can be modified).
fun main(){
// Immutable List
    val lst = listof("one", "two", "three")
    println("Mutable list")
    for(i in lst.indices){
        println(lst[i])
    }
    println()
// Mutable List
    val mutableLst = mutableListOf("one", "two", "three")
    mutableLst.add("Four")
    println("Immutable list")
    for(i in mutableLst.indices){
        println(mutableLst[i])
    }
}
