open class Person(open val name: String){

open fun introducte(name: String){
    println("Hello, my name is $name")
    }

    open fun talk(){
        println("")
    }
}