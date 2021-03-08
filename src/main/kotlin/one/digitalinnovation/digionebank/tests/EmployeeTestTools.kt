package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Employee
import one.digitalinnovation.digionebank.Authenticable

class EmployeeTestTools {
    companion object {
        fun print(employee: Employee) = println(employee.toString())

        fun login(authenticable: Authenticable) = println(authenticable.login())
    }
}