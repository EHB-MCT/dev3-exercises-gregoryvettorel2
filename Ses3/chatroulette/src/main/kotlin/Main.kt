fun main() {
    val people = listOf(Student("Joost"), Teacher("Lies"), Comedian("Mike"), Chatbot())

    val randomPerson = people.random()
    randomPerson.introduce()
    randomPerson.talk()
}