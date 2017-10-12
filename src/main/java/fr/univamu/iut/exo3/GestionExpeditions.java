package fr.univamu.iut.exo3;

import fr.univamu.iut.Conteneur;
import fr.univamu.iut.exo1.*;

import java.io.IOException;
import java.util.List;

public class GestionExpeditions
{
    public static void main(String[] args)
    {
        try
        {
            List<Conteneur> conteneurs = fr.univamu.iut.exo1.Lecteur.charger ("Conteneurs.ser");
            for (Conteneur con : conteneurs)
                System.out.println(con.toString());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        assertTrue (Arrays.equals(conteneurs.toArray(), Lecteur.charger("Conteneurs.ser").toArray()));
    }
}


