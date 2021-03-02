package one.digitalinnovation.digionebank

class Person {
    lateinit var name:String
    lateinit var cpf:String
    private set

    constructor() {
        cpf = "123.456.789-10"
    }

    fun getInfo() = "$name, $cpf";
}

fun main() {
    val person = Person()
    person.name = "Pedro"

    println(person.getInfo())
}