class Comedian(override val name: String): Person(name){

    fun tellJoke(){
        println("there were 2 belgians in a bar ...")
    }
}