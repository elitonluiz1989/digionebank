package one.digitalinnovation.digionebank

class Analyst (
    name: String,
    document: String,
    salary: Double
) : Employee(name, document, salary) {
    override fun calculateGratification() = salary * 0.1
}