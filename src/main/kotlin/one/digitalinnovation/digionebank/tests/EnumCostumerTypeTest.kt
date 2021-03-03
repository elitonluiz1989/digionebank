package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.CostumerType

fun main() {
    CostumerType.values().forEach {
        println("${it.name}, ${it.description}")
    }

    val costumerLP = CostumerType.LEGAL_PERSON
    println("${costumerLP.name}, ${costumerLP.description}")
}