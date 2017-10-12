package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;
import java.util.List;
import java.io.*;
import java.util.ArrayList;

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
