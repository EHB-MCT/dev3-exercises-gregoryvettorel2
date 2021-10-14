fun main() {
    println("1823, Somewhere in Egypt")
    println("You are an adventurer trying to get a treasure that is hidden deep inside a piramid.")
    println("You must solve layers of riddles to get to the treasure room, good luck....")
    challengeOne()
}

//CHALLENGES
fun challengeOne() {
    println("Challenge 1")
    println("A sfinx appears before you and says 'to advance you must solve this riddle for me: What creature walks on four legs in the morning, two legs at noon, and three legs in the evening?'")
    println("If you answer right you can proceed, if you're wrong, you DIE")
    println("Your answer:")
    val userAnswer = readLine()

    if (userAnswer == "Human" || userAnswer == "human") {
        challengeTwo()
    } else {
        gameOver()
    }
}

fun challengeTwo() {
    println("The door opens, you pass through the long hallway and at the end a talking cat appears, he says:")
    println("'For the next challenge you need to guess low (1-3) or high (4-6). I will then roll the dice. If you're right you can pass, but if you're wrong ....'")
    println("Your number:")
    val userNumber = readLine()!!.toInt()

    val catNumber = rollDice()

    if(catNumber < 4 && userNumber < 4){
        challengeThree()
    } else if (catNumber > 3 && userNumber > 3) {
        challengeThree()
    } else {
        gameOver()
    }
}

fun challengeThree() {
    println("You passed the second challenge! The cat hisses at you and runs away.")
    println("You go down a ladder")
    println("You come in a room with three weapons in front of you: bow, sword and shield")
    println("You hear a distant and eery voice whisper 'choose wisely or it may be the last thing you dooooo...'")
    println("Which weapon do you choose:")
    val userChoice = readLine()

    if(userChoice == "bow") {
        challengeFour()
    } else if (userChoice == "sword") {
        gameOver()
    } else if (userChoice == "shield") {
        challengeThree()
    }
}

fun challengeFour() {
    println("You chose correctly! Hurry up and get to the next room before the door closes!")
    println("Challenge number 4")
    println("The same cat comes back and asks you to pick a number between 1 - 10")
    val randomNum = randomNumber()
    println("Your number:")
    var userInput = readLine()!!.toInt()

    do{
        if(userInput < randomNum) {
            println("guess higher")
            userInput = readLine()!!.toInt()
        } else if (userInput > randomNum) {
            println("guess lower")
            userInput = readLine()!!.toInt()
        }
    } while(randomNum !== userInput)
    endBoss()
}

fun endBoss(){
    val anagrams = mapOf("HORAH" to "Pharaoh", "MIDPAY" to "Pyramid", "erasure" to "Treasure")
    println("Congratulations! You made it to the last challenge, but don't cheer too soon for this challenge might be your doom...")
    println("Which word can you form with the letters (first letter is capital): ")

}

fun rollDice():Int {
    val randomNumber = (1..6).random()
    return randomNumber
}

fun randomNumber():Int {
    val randomNumber = (1..10).random()
    return randomNumber
}

//WIN OR LOSE FUNCTIONS
fun win() {
    println("you pass")
}

fun gameOver(){
    println("A big boulder falls on you and you die")
}
//test commit