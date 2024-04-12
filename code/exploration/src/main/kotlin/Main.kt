package ca.cegeplevis

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