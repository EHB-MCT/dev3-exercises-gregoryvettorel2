val students = listOf("Greg", "Jeroen", "Robbe", "Nick", "Kevin")

fun main() {
greeting()
}

fun greeting() {
    for(student in students){
        println("Hello " + student)
    }
}