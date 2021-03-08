package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Manager

fun main() {
    val manager = Manager(name = "Alice", document = "091.786.543-21", salary = 5000.0, password = "123")

    TestTools.printPerson(manager)
    TestTools.isAuthenticated(manager)
}