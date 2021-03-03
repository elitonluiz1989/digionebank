package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Person

fun main() {
    val person = Person(name = "Pedro", document = "127.456.789-10")

    println(person.name)
    println(person.document)
}