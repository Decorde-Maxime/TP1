package fr.univamu.iut.exo3;

import fr.univamu.iut.Conteneur;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by d16013755 on 12/10/17.
 */
public class Lecteur {

    public static List<Conteneur> charger(String fichier){
        List<Conteneur> conteneurs = new ArrayList<>();

        ObjectInputStream entree = null;
        try {
            while (true) {
                Conteneur con = new Conteneur();
                con.charger(entree);
                conteneurs.add(con);
            }
        }
        catch (IOException)
        {
            System.out.print("Erreur de lecture du fichier");
        }
        catch (EOFException)
        {
            System.out.print("Lecture terminée");
        }
        catch (ClassNotFoundException)
        {

        }
    }
}
