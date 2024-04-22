package ca.cegeplevis

import java.util.*

fun main() {
    println("Salut le groupe!")
    println(longueur("bonjour"))

    val coucou = "salut"

    println(coucou)

    val moteur = Moteur(234, 97.3)
    println(moteur.message())

    val uneListe = listOf(1, 2, 3)

    val nouvelleListe = uneListe.map { it + 2 } // it + 2 est la même chose que x -> x + 2
    println(nouvelleListe)

    for (item in nouvelleListe) {
        println(item)
    }

    for (i in nouvelleListe.indices) {
        println(nouvelleListe[i])
    }

    print(describe(42))
    print(describe(2))

    nouvelleListe.filter { it >= 4 }.forEach{ println(it) }

    val asdf = nouvelleListe.reduce { acc,  gne -> acc + gne }

    println(asdf)

    val totalMontants = mutableListOf<Double>()
    val commandes = listOf(Commande(UUID(1L, 2L), UUID(1L, 2L), 3.0, 4.0, Calendar.getInstance()),
        Commande(UUID(1L, 2L), UUID(1L, 2L), 3.0, 4.0, Calendar.getInstance()))

    // En paradigme impératif
    var accumulation = 0.0
    for (commande: Commande in commandes) {
        val paieTotale = commande.paieBase + commande.pourboire
        if (paieTotale > 0) {
            totalMontants.add(paieTotale)
            accumulation += paieTotale
        }
    }

    // En paradigme fonctionnel
    val resultat = commandes
        .map { commande -> commande.paieBase + commande.pourboire }
        .filter { paieTotale -> paieTotale > 0 }
        .reduce { acc, x -> x + acc }

    println(resultat)
    print(resultat)
}

fun longueur(a: String) = a.length

fun dependant(valeur: Int): Int = if (valeur < 0) 3 else 4


fun pasPure(): Int {
    println("Je vais faire un calcul")
    return 3
}

fun allo(): Unit = TODO()

fun describe(obj: Int): String =
    when (obj) {
        1 -> "un\n"
        2 -> "deux\n"
        else -> "autre\n"
    }

fun direction(dir: Direction) =
    when (dir) {
        Direction.Nord -> "Nord"
        Direction.Sud -> "Sud"
        Direction.Est -> "Est"
        Direction.Ouest -> "Ouest"
    }