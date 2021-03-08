package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.tests.TestTools

class Costumer(
    name: String,
    document: String,
    val costumerType: CostumerType,
    override val password: String
) : Person(name, document), Authenticable {
    override fun authenticated() = "123456" == password

    override fun toString(): String {
        return """
            Name: $name
            Document: $document
            Costumer Type: ${costumerType.description}
        """.trimIndent()
    }
}