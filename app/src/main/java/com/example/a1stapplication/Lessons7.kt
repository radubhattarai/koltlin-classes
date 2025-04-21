package com.example.a1stapplication

//switchcase

fun main() {
    var day: String
    when (dayNumber) {
        1 -> day = "Sunday"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thursday"
        6 -> day = "Friday"
    }
    println(day)

    //infinite loop
    var number = Random.nextInt(from: 0, until: 10000)
    println("Please enter any number from 0 to 10000:
        while (2>1){
            var userGuess: Int = readln()!!.toInt()
            if (userGuess == number) {
                println("congratulations!!!!, you won")
                break
            }else if(userGuess<number){
                println("Increase your guess")
            }else{
                println("Decrease your guess")
            }
        }
                Do-while Loop
}
