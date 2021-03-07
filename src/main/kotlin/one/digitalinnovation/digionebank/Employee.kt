package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Employee(
    name: String,
    document: String,
    val salary: Double
) : Person(name, document) {
    protected abstract fun calculateGratification(): Double

    override fun toString(): String {
        return """
            Name: $name
            Document: $document
            Salary: $salary
            Gratification: ${calculateGratification()}
        """.trimIndent()
    }
}