package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

/**
 * Created by d16013755 on 12/10/17.
 */
    @Test
    public List<Conteneur> TesterChargement (){

        List<Conteneur> conteneurs = new.ArrayList<>();
        conteneurs.add(new Conteneur(expediteur "Soc1", poids 110, destination "Alicante"))
        conteneurs.add(new Conteneur(expediteur "Soc3", poids 110, destination "Barcelone"))
        conteneurs.add(new Conteneur(expediteur "Soc2", poids 90, destination "Valence"))

        assert
    }
}
