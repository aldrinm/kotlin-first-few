fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    println("gameChoice = ${gameChoice}")

    val userChoice = getUserChoice(options)
    println("userChoice = ${userChoice}")

    printResult(gameChoice, userChoice)
}

fun printResult(gameChoice: String, userChoice: String) {
    val result: String
    if (gameChoice == userChoice) {
        result = "Tie!"
    }
    else if ((userChoice == "Rock" && gameChoice == "Scissors")
        || (userChoice == "Paper" && gameChoice == "Rock")
        || (userChoice == "Scissors" && gameChoice == "Paper")) {
        result = "You WIN!!"
    } else {
        result = "You LOSE!!"
    }

    println("You <= $userChoice. Me => $gameChoice. $result")

}

fun getGameChoice(optionsParams: Array<String>) = optionsParams[(Math.random() * optionsParams.size).toInt()]

fun getUserChoice(optionsParams: Array<String>):String {
    var userChoice:String = ""
    var userInput: String? = null
    while (!(userInput in optionsParams)) {
        print("Enter one of the following: ")
        for (option in optionsParams) {
            print(" $option")
        }
        println(".")
        userInput = readLine()

        if (userInput != null) {
            userChoice = userInput
        }
    }

    return userChoice
}


/////////
fun hello(): String {
    return "Hello"
}

fun silence() { //no return type
}

fun explicitSilence(): Unit { //Unit is like Java `void`
}

//function single-expression body, implied return type
fun max(a: Int, b:Int) = if (a>b) a else b

fun forloop() {
    //use until to exclude the last one
    println("until")
    for (x in 1 until 10) {
        println(x)
    }

    println("downto")
    for (x in 15 downTo 7) {
        println(x)
    }

    println("step")
    for (x in 0 .. 20 step 2) {
        println(x)
    }

    println("indices")
    val options = arrayOf("a", "b", "c")
    for (i in options.indices) {
        println(i)
    }
    for ((i, value) in options.withIndex()) {
        println("$i => $value")
    }
}
