package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;


public class Lecteur {
    public static Collection<Conteneur> charger(String fichier) {
        Collection<Conteneur> lesConteneursALire = new TreeSet<Conteneur>(new Comparator<Conteneur>() { //tri dans la liste les conteneur de la distance la plus petite a la plus grande
            @Override
            public int compare(Conteneur conteneur, Conteneur conteneur2) {
                return  conteneur.getDistance().compareTo(conteneur2.getDistance()); //renvoie 1 si (c1 > c2)
            }

            @Override
            public boolean equals(Object o) {
                return false;
            }
        }); //liste de conteneurs
        try (FileInputStream fileInputStream = new FileInputStream(fichier); //recupere le fichier
             ObjectInputStream ois = new ObjectInputStream(fileInputStream)) { //convertit le fichier en objet conteneur
            try {
                while (true)
                    lesConteneursALire.add((Conteneur) ois.readObject()); //utilisation des cast en transformant les object en conteneur et les ajoutant a notre lsite de conteneur
            } catch (EOFException e) {
                System.out.println("Fin de lecture");// si fin de fichier
            } catch (ClassNotFoundException e) { //si probleme de conversion
                e.printStackTrace();
                System.out.println("Je n'arrive pas à convertir les objets du fichier " + fichier + " dans des Conteneurs");
            }

        } catch (FileNotFoundException e) { // si fichier pas trouvé
            e.printStackTrace();
            System.out.println("Je n'arrive pas à trouver le fichier " + fichier);
        } catch (IOException e) { //si probleme lecture du flux
            e.printStackTrace();
            System.out.println("Erreur de lecture flux");
        }
        return lesConteneursALire; //return car fonction non void
    }
}

