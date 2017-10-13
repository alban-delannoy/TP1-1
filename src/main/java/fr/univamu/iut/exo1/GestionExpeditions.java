package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;

import java.util.Collection;
import java.util.TreeSet;

public class GestionExpeditions {
    public static void main(String[] args) {
        TreeSet<Conteneur> collection = (TreeSet<Conteneur>) Lecteur.charger("Conteneurs.ser"); //utilise notre metchode charger et charge le fichier conteneur,qu'on met dnas une liste
        Chargement chargement = new Chargement(collection);
        chargement.debarquer();
        chargement.embarquer(new Conteneur("ALBAN",30,"Malaga"));
        System.out.println(chargement);
    }
}

