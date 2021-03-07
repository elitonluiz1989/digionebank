package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Analyst

fun main() {
    val manager = Analyst(name = "Alice", document = "091.786.543-21", salary = 5000.0)

    EmployeeTestTools.print(manager)
}