package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Analyst

fun main() {
    val analyst = Analyst(name = "Marcelo", document = "019.876.543-21", salary = 3000.0)

    TestTools.printPerson(analyst)
}