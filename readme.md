# DESIGN PATTERN DECORATEUR
Ce dépôt contient un exemple afin de présenter le Design Pattern decorateur
 
## Démarrage rapide
Pour tester ce code vous pouvez demarrer votre IDE habituelle est l'integrer dans votre IDE préférer rien de plus...

## Prérequis
Afin de pouvoir exécuter l'application sur votre poste, vous devez connaitre les rudiments du langage java et les principes d'heritage et d'interfaces:
  * Java 8
 
### PATTERN DECORATEUR EXPLICATION
Dans ce modèle, on voit plusieurs choses :
On peut créer plusieurs composants concret
On peut étendre les fonctionnalités de nos composants grâce au décorateur
Le decorateur est une classe abstraite qui hérite de Composant et qui a un attribut Composant
Chaque DecorateurConcret redéfinie les méthodes de Décorateur
Interets
Lorsque le dévelopeur à vu une partie de l'application qui est sujette à beaucoup d'évolution, 
sa tache est grandement simplifier par ce design pattern.
Le pattern decorateur est une alternative a l’heritage.

