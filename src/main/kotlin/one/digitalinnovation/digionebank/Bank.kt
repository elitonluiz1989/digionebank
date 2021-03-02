package one.digitalinnovation.digionebank

data class Bank (
    val name: String,
    val number: Int
) {
    fun getNumber() = number.toString().padStart(3, '0')

    fun info() = "$name - ${getNumber()}"
}