package one.digitalinnovation.digionebank

class Person {
    lateinit var name:String
    lateinit var cpf:String
    private set
}

fun main() {
    val person = Person()
    person.name = "Pedro"

    println(person.name)
    println(person.cpf)
}