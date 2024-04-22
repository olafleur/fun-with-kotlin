# Laboratoire semaine 12 (LabF2) - 5%
## Programmation fonctionnelle en Kotlin

*Ce laboratoire doit être réalisé en Kotlin. Tout au long de celui-ci, [la documentation officielle](https://kotlinlang.org/docs/basic-syntax.html) et les exemples faits en classe vous seront potentiellement utile. N'hésitez pas à les utiliser au besoin!*

1. Créez une application console comme suggéré à la fin du [laboratoire 11](lab-semaine-11.md), qui aura un menu similaire à celui-ci (les informations peuvent être différentes, celui-ci réapparaître une foix chaque action complétée) : 

```
Bienvenue au zoo!
***************
Vous avez 3 animaux : 
1. Link (chat, 4 ans, 27 lbs, noir, 100% d'énergie)
2. Zelda (chat, 3.5 ans, 25 lbs, blanc, 74% d'énergie)
3. Ganondorf (chien, 7 ans, 40 lbs, gris, 24% d'énergie, malade)

Voici vos options : 
a. Faire manger un animal 
b. Faire courir un animal
c. Soigner un animal
d. Faire afficher seulement les animaux malades
e. Augmenter l'âge de tous les animaux
f. Poids total de tous les animaux

Veuillez entrez la lettre de votre choix
```

1. `Faire manger un animal` augmentera son énergie de 20% pour les chats, 10% pour les chiens
1. `Faire courir un animal` diminuera son énergie de 15% pour tous les animaux (refusera de courir si énergie moins de 15%)
1. `Soigner un animal` changera la valeur booléenne du champ `malade` à `false`
1. `Faire afficher seulement les animaux malades` utilisera un `filter`
1. `Augmenter l'âge de tous les animaux` utilisera un `map`
1. `Poids total de tous les animaux` utilisera un `reduce`

**À terminer et remettre au professeur pour le lundi 6 mai 2024**