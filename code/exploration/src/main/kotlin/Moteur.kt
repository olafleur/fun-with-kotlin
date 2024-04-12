package ca.cegeplevis

class Moteur(private val puissance: Int, private val qualite: Double): Ouvrable {
    fun message() = "Ce moteur est de puissance $puissance et de qualite $qualite"

    val multiplication = puissance * qualite
    override fun ouvrir() {
        TODO("Not yet implemented")
    }

    override fun fermer() {
        TODO("Not yet implemented")
    }
}