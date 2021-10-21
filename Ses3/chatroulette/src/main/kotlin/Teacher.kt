class Teacher(override val name: String): Person(name){

    fun funFact(){
        println("did ya know that ......")
    }
}