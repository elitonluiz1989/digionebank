package one.digitalinnovation.digionebank

class Manager(
    name: String,
    document: String,
    salary: Double,
    override val password: String
) : Employee(name, document, salary), Authenticable {
    override fun calculateGratification() = salary * 0.4

    override fun authenticated() = "123" == password

}