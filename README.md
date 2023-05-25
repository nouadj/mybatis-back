# mybatis-back
# Installation
mvn clean install
# L'application Back
L'application back est dévloppée avec Java 17, j'ai testé les records (regardez record PersonneImmutable) dans cette application, elle doit tourner sur le port 8080 pour que le front puisse communiquer avec.
# Configuration de la BDD :
Une bdd MySQL => insetion de fichier entretien_mybatis.sql
Dans le fichier application.properties MySQL tourne sur 3306; à noter qu'il contient une seule table personne avec les champs nom, prenom et adresse (adresse ne doit pas etre un champ dans un cas concret plutot une table avec une relation avec la table personne mais just pou s'implifier les choses)

# L'application front
L'application front doit tourner sur le port 4200 pour que le back l'autorise.

