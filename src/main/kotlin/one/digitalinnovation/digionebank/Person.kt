package one.digitalinnovation.digionebank

class Person {
    lateinit var name:String
    lateinit var cpf:String
}

fun main() {
    val person = Person()
    person.name = "Pedro";
    person.cpf = "123.456.789-10";

    println(person.name)
    println(person.cpf)
}