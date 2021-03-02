package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Bank

fun main() {
    val testBank = Bank(name ="Test Bank", number = 1)
    println(testBank.name)
    println(testBank.getNumber())

    val bankAnotherTest = testBank.copy(name ="Another Test Bank")
    println(bankAnotherTest.info())
}