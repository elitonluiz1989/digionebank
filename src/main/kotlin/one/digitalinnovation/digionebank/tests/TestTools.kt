package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Authenticable
import one.digitalinnovation.digionebank.Person

class TestTools {
    companion object {
        fun printPerson(person: Person) = println(person.toString())

        fun isAuthenticated(authenticable: Authenticable) = println(authenticable.authenticated())
    }
}