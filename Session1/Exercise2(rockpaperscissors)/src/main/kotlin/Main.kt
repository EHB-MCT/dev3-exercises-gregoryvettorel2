fun main() {
    val options = listOf("Rock", "Paper", "Scissors")

    //Picks a random
    val c = options.random()

    //Takes user input
    val u = getInput()

    val x = validateInput(u)

    if(x == "") {
        println("You picked $u")
        println("Computer picked $c")
        println(play(c, u))
    } else {
        println(x)
        return
    }
}

fun getInput():String? {
    println("Enter Rock, Paper or Scissors:")
    val userInput = readLine()
    return userInput
}

fun play(computerInput:String?,userInput:String?): String {
    if(computerInput == userInput){
        return "It's a tie!"
    } else if(computerInput == "Rock" && userInput == "Scissors"){
        return "Computer wins! You lose!"
    } else if(computerInput == "Rock" && userInput == "Paper"){
        return "You win! Computer loses!"
    } else if (computerInput == "Scissors" && userInput == "Paper"){
        return "Computer wins! You lose!"
    } else if (computerInput == "Scissors" && userInput == "Rock") {
        return "You win! Computer loses!"
    } else if (computerInput == "Paper" && userInput == "Scissors"){
        return "You win! Computer loses!"
    } else if (computerInput == "Paper" && userInput == "Rock") {
        return "Computer wins! You lose!"
    } else {
        return "Error"
    }
}

fun validateInput(userInput: String?): String {
    if(userInput == "Rock" || userInput == "Scissors" || userInput == "Paper"){
        return ""
    } else {
        return "Please enter a valid option."
    }
}