package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;

import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class GestionExpeditions {
    public static void main(String[] args) {
        TreeSet<Conteneur> conteneurs = (TreeSet<Conteneur>) Lecteur.charger("Conteneurs.ser"); //utilise notre metchode charger et charge le fichier conteneur,qu'on met dnas une liste
        PriorityQueue<Conteneur> priorityQueue = new PriorityQueue<Conteneur>(new Comparator<Conteneur>() { //treeset pas adapte car supprime les double,et uncicité
            @Override
            public int compare(Conteneur conteneur, Conteneur conteneur2) {
                return conteneur.getPoids().compareTo(conteneur2.getPoids());
            }
        });
        priorityQueue.addAll(conteneurs);
        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.element());
            priorityQueue.remove();//supprime le premier element de la collection
        }
    }
}

