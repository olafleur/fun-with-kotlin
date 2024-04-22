# Laboratoire semaine 11 (LabF1)
## Introduction à Kotlin

*Ce laboratoire doit être réalisé en Kotlin. Tout au long de celui-ci, [la documentation officielle](https://kotlinlang.org/docs/basic-syntax.html) vous sera potentiellement utile. N'hésitez pas à l'utiliser au besoin!*

1. Bâtir un projet *Hello World* en Kotlin, comme démontré en classe. Cela vous permettra de vous assurer que tout est bien configuré (environnement, JDK, etc.)
1. Créez une classe `Chat` avec les attributs suivants : `nom` (une chaîne de caractères), `couleur` (une classe `enum`), `poids` (valeur flottante), `malade` (un booléen) et `energie` (un entier qui sera un pourcentage de 0 à 100).
1. Faites hériter la classe `Chat` d'une interface `EtreVivant`, qui vous forcera à ajouter la classe `manger` et la classe `depenserEnergie` à votre classe `Chat`.
1. Créez au moins 3 chats dans une liste avec différents attributs.
1. Faites manger et "travailler" vos chats en leur faisant dépenser de l'énergie. Lorsque leur énergie arrive à zéro, ils ne doivent plus coopérer et refusent d'appliquer l'instruction (ils ne peuvent pas avoir une énergie négative).
1. Utilisez la fonction `map` pour faire doubler le poids de vos chats qui sont dans votre liste.
1. Utilisez la fonction `filter` pour voir seulement les chats dont on doit s'occuper (qui sont malades).
1. Créez une classe `Chien` qui implémente aussi l'interface `EtreVivant` avec au moins 3 attributs cohérents de votre choix.
1. Faites une liste d'êtres vivants et utilisez la fonction `filter` pour enlever tous les chats noirs.

**À terminer idéalement pour le lundi 29 avril 2024, n'est pas à remettre, mais vous aidera beaucoup pour le prochain TP**

## Explorations supplémentaires, si vous avez le temps (facultatif)
1. Trouvez comment faire entrer à l'utilisateur des données à la console via votre programme (en anglais on parle de *console input*).
1. Permettez à l'utilisateur de votre programme de créer un ou des animaux et de le(s) faire manger et dépenser de l'énergie via un menu console.
1. Permettez aussi à l'utilisateur d'appliquer un ou plusieurs `map` ou `filter` via la console (chats noirs, gros chiens, laissez aller votre imagination!).
