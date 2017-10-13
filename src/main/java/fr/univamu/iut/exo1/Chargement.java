package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.TreeSet;

public class Chargement {
    private Deque<Conteneur> deque = new ArrayDeque<Conteneur>(); //on fait une pile pour pouvoir enlever le top, le remplacer...Organisation des conteneurs
    public Chargement(TreeSet<Conteneur> conteneurs) {
        for (Conteneur c : conteneurs) {
            deque.push(c);
        }
    }
    public void embarquer(Conteneur conteneur) {
        deque.push(conteneur);
    }

    public void debarquer() {
        deque.pop();
    }

}

