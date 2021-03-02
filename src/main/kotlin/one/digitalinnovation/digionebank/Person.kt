package one.digitalinnovation.digionebank

class Person {
    lateinit var name:String
    var cpf = "123.456.789-10"
    private set

    constructor() {}

    fun info() = "$name, $cpf"
}

fun main() {
    val person = Person()
    person.name = "Pedro"

    println(person.info())
}