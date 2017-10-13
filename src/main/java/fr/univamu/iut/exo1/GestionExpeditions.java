package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;

import java.util.Collection;

public class GestionExpeditions {
    public static void main(String[] args) {
        Collection<Conteneur> lesConteneurs = Lecteur.charger("Conteneurs.ser"); //utilise notre metchode charger et charge le fichier
        System.out.println(lesConteneurs);
    }
}

