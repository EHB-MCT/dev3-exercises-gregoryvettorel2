fun main() {
    println("1823, Somewhere in Egypt")
    println("You are an adventurer trying to get a treasure that is hidden deep inside a piramid.")
    println("You must solve layers of riddles to get to the treasure room, good luck....")
    challengeOne()
    println("The door opens, you pass through the long hallway and at the end a talking cat appears, he says:")
    challengeTwo()
    println("You passed the second challenge! The cat hisses at you and runs away.")
    println("You go down a ladder")
}

//CHALLENGES
fun challengeOne() {
    println("Challenge 1")
    println("A sfinx appears before you and says 'to advance you must solve this riddle for me: What creature walks on four legs in the morning, two legs at noon, and three legs in the evening?'")
    println("If you answer right you can proceed, if you're wrong, you DIE")
    println("Your answer:")
    val userAnswer = readLine()

//    val answers = setOf("lion", "Elephant", "Rhino", "Buffalo", "Leopard")

    if (userAnswer == "Human" || userAnswer == "human") {
        win()
    } else {
        gameOver()
    }
}

fun challengeTwo() {
    println("'For the next challenge you need to guess low (1-3) or high (4-6). I will then roll the dice. If you're right you can pass, but if you're wrong ....'")
    println("Your number:")
    val userNumber = readLine()!!.toInt()

    val catNumber = rollDice()

    if(catNumber < 4 && userNumber < 4){
        win()
    } else if (catNumber > 3 && userNumber > 3) {
        win()
    } else {
        gameOver()
    }
}

fun rollDice():Int {
    val randomNumber = (1..6).random()
    return randomNumber
}

//WIN OR LOSE FUNCTIONS
fun win() {
    println("you win")
}

fun gameOver(){
    println("A big boulder falls on you and you die")
}