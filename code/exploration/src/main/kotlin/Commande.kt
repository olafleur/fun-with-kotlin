package ca.cegeplevis

import java.util.*

data class Commande(
    val id: UUID,
    val dasherId: UUID,
    val paieBase: Double,
    val pourboire: Double,
    val dropOffTime: Calendar
)