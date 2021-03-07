package one.digitalinnovation.digionebank

class Manager(
    name: String,
    document: String,
    salary: Double
) : Employee(name, document, salary) {
    override fun calculateGratification() = salary * 0.4
}