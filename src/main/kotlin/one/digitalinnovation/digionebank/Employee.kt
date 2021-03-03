package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Employee(
    override val name: String,
    override val document: String,
    val salary: BigDecimal
) : Person(name, document)