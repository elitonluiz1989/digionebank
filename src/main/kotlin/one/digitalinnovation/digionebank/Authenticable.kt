package one.digitalinnovation.digionebank

interface Authenticable {
    val password: String

    fun authenticated(): Boolean
}