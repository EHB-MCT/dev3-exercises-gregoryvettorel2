class Comedian(override val name: String): Person(name){

    override fun talk(){
        tellJoke()
    }

    fun tellJoke(){
        println("there were 2 belgians in a bar ...")
    }
}