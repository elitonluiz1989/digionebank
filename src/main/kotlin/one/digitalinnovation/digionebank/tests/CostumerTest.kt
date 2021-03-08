package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Costumer
import one.digitalinnovation.digionebank.CostumerType

fun main() {
    val costumer = Costumer(
        name = "Willian",
        document = "091.786.543-21",
        costumerType = CostumerType.NATURAL_PERSON,
        password = "123456"
    )

    TestTools.printPerson(costumer)
    TestTools.isAuthenticated(costumer)
}