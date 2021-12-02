class Duolingo{

    var numberOfRounds = 0;
    var preferredLanguage = "";
    var difficulty = "";

    constructor(numberOfRounds: Int = 5, preferredLanguage: String = "English") {
        this.numberOfRounds = numberOfRounds
        this.preferredLanguage = preferredLanguage
    }

    constructor(difficulty: String) {
        this.difficulty = difficulty
        if(difficulty == "Hard"){
            numberOfRounds = 6
        } else if (difficulty == "Easy"){
            numberOfRounds = 3
        }
    }


    //English words
    val Me = Word("Me", "Ik", "English", true, false)
    val Chair = Word("Chair", "Stoel", "English",true, false)
    val Sky = Word("Sky", "Lucht", "English",true, false)
    val Mug = Word("Mug", "Tas", "English",true, false)
    val Pencil = Word("Pencil", "Potlood", "English",true, false)
    val Screen = Word("Screen", "Scherm", "English",true, false)
    val Bottle = Word("Bottle", "Fles", "English",true, false)
    val Hello = Word("Hello", "Hallo", "English",true, false)
    val Bread = Word("Bread", "Brood", "English",true, false)
    val Wine = Word("Wine", "Wijn", "English",true, false)
    val EnglishWords = listOf(Me,Chair,Sky,Mug,Pencil,Screen,Bottle,Hello,Bread,Wine)

    //French words
    val Moi = Word("Moi", "Ik", "Francais",false,true)
    val Chaise = Word("Chaise", "Stoel", "Francais",false,true)
    val Ciel = Word("Ciel", "Lucht", "Francais",false,true)
    val Tasse = Word("Tasse", "Tas", "Francais",false,true)
    val Table = Word("Table", "Tafel", "Francais",false,true)
    val Ecran = Word("Ecran", "Scherm", "Francais",false,true)
    val Bouteille = Word("Bouteille", "Fles", "Francais",false,true)
    val Bonjour = Word("Bonjour", "Hallo", "Francais",false,true)
    val Pain = Word("Pain", "Brood", "Francais",false,true)
    val Vin = Word("Vin", "Wijn", "Francais",false,true)
    val frenchWords = listOf(Moi, Chaise, Ciel, Tasse, Table, Ecran, Bouteille, Bonjour, Pain, Vin)

    //Mix of words
    val wordsMix = EnglishWords.plus(frenchWords)

    fun play() {
        var filteredWords = wordsMix.filter { it.language == preferredLanguage }

        var selectedWords = filteredWords.shuffled().take(numberOfRounds).toMutableSet()

        while(selectedWords.isNotEmpty()) {
            val selectedWord = selectedWords.random()
            println(selectedWord.original)
            val userAnswer = readLine()

            if (selectedWord.translated == userAnswer) {
                selectedWords.remove(selectedWord)
            } else {
                println(selectedWord.translated)
            }

            println(selectedWords.count())
        }
        println("You made it!")
    }
}