package fr.univamu.iut.exo1;

import java.util.HashMap;
import java.util.Map;

public class GestionDistance {
    private static Map<String,Integer> distance = new HashMap<>();
    static  { //class de donnée qui sert a rien,pas d'objet,on peux mettre static(qui contient des donnée)
        distance.put("Barcelone",183);
        distance.put("Valence",337);
        distance.put("Alicante", 399);
        distance.put("Malaga",599);
    }
    public static Integer getDistance(String ville)
    {
        return distance.get(ville);
    }
}
