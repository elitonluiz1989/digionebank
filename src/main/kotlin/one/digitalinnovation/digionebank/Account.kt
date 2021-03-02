package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Account (
    val agency:String,
    val number:String,
    val balance:BigDecimal
) {
    fun credit () {}

    fun debit () {}
}