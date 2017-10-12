package fr.univamu.iut.exo2;

import java.util.Map;

/**
 * Created by d16013755 on 12/10/17.
 */
public class GestionDistances {
    private static Map<String, Integer> distances;
    private String ville;
    private Integer distance;

    static {
        distances.put("BARCELONE", 183);
        distances.put("VALENCE", 337);
        distances.put("ALICANTE", 399);
        distances.put("MALAGA", 599);
    }


    public static Integer getDistances (String destination) {
        Integer distance = hm.get(destination);
        return distance ;
    }
}
