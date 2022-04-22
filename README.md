# Yanport-TTechnique.

Pour exécuter le programme, il faut:  
- Ouvrir le projet avec un IDE Java (Intellij IDEA / Eclipse).  
- Ensuite, exécuter la classe *Main.java*.  

Sinon, pour une exécution à l'aide de la commande de ligne:  
``javac Main.java``  
``java Main``.  

Un petit test unitaire écrit dans la classe "Test1.java" et qui donne le même résultat que l'exécution du programme Main.  
L'exécution du test unitaire exige la dépendance ``junit`` suivante:   

````
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
