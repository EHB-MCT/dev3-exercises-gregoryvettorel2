fun main() {
    //OPDRACHT 1
    val people = listOf(Person("Joost"), Person("Lies"))

    val randomPerson = people.random()
    val randomName = randomPerson.name

    randomPerson.introducte(randomName)
    //

    val dude = Comedian("Bert")

}