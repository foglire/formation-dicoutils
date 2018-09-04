# formation-dicoutils
Projet Java SE utilisant les API Lang, Util, Collection, IO

# Sujet

Un client vous exprime le besoin suivant :

J'ai un fichier de dictionnaire qui contient un ensemble de mots, avec un mot par ligne, et j'aimerais pouvoir vérifier facilement quels mots sont présents dans ce fichier. Je veux une application qui s'exécute en ligne de commande, et qui me permet d'effectuer plusieurs actions avant de quitter.
Les fonctions de recherche dont j'ai besoin sont les suivantes :
- Rechercher la présence d'un mot exacte
- Rechercher tous les mots qui commencent par une valeur
- Rechercher tous les mots qui terminent par une valeur
- Rechercher tous les mots qui contiennent une valeur
- Rechercher des mots par une expression régulière

# Création du projet

## Préparation

- Création d'un nouveau projet avec le nom "DicoUtils" : Menu File -> New -> Java Project.
- Création d'un package Java racine pour le projet : "fr.formation.dicoutils".

## Ajout de la librairie Log4J

- Télécharger la librairie Log4J2 : https://logging.apache.org/log4j/1.2/download.html
- Ouvrir l'archive ZIP et extraire les JAR "log4j-api-2.x.x.jar" et "log4j-core-2.x.x.jar" dans un novueau dossier "lib" à côté du dossier "src", dans le projet. Ne pas oublier de faire File -> Refresh dans Eclipse si les fichiers sont ajoutés en dehors de l'IDE, par l'explorer Windows par exemple.
- Sélectionner les deux JAR dans la vue project explorer d'Eclipse et clic droit -> Build path -> add to build path

### Configuration Log4J

TODO

## Conception
