package com.example.a1stapplication

fun main(){
    //operators
    var num1: Double = 10.6
    var num2: Double = 5.0
    var result: Double = 0.0
    result = num1 + num2
    println("num1 + num2 is $result")
    result = num1 - num2
    println("num1 - num2 is $result")
    result = num1 * num2
    println("num1 * num2 is $result")
    result = num1 / num2
    println("num1 / num2 is $result")
    result = num1 % num2
    println("num1 % num2 is $result")

    var a: Int = 6
    var b: Int = 5
    println("a == b : " + (a == b))
    println("a != b : " + (a != b))
    println("a < b : " + (a < b))
    println("a > b : " + (a > b))
    println("a >= b : " + (a >= b))
    println("a <= b : " + (a <= b))
}