fun main() {
    println("1823, Somewhere in Egypt")
    println("You are an adventurer trying to get a treasure that is hidden deep inside a piramid.")
    println("You must solve layers of riddles to get to the treasure room, good luck....")
    challengeOne()
    challengeTwo()
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

}


//WIN OR LOSE FUNCTIONS
fun win() {
    println("you win")
}

fun gameOver(){
    println("A big boulder falls on you and you die")
}