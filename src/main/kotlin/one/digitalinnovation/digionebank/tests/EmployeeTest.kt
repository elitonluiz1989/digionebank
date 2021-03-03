package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Employee
import one.digitalinnovation.digionebank.Person
import java.math.BigDecimal

fun main() {
    val person = Person(name = "Pedro", document = "127.456.789-10")

    println(person.name)
    println(person.document)

    val employee = Employee(name = "Marcelo", document = "019.876.543-21", salary = BigDecimal.valueOf(3000.0))

    println(employee.name)
    println(employee.document)
    println(employee.salary)
}