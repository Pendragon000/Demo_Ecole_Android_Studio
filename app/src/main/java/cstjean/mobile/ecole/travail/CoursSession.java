package cstjean.mobile.ecole.travail;

import cstjean.mobile.ecole.travail.rapport.RapportCours;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Class coursSession.
 */
public class CoursSession implements Comparable<CoursSession> {

    /**
     * Le nom du département.
     */
    private final String departement;
    /**
     * Le numero du cours.
     */
    private final String numero;
    private URL url;
    /**
     * La liste de travaux pour le cours.
     */
    private final List<Travail> travaux = new ArrayList<>();
    private static int compteur = 0;

    public CoursSession(String departement, String numero) {
        this.departement = departement;
        this.numero = numero;
        incrementerCompteur();
    }

    public String getDepartement() {
        return departement;
    }
    public String getDepartementNumero() {
        return departement + " " + numero;
    }

    public String getNumero() {
        return numero;
    }

    public int getNombreTravaux() {
        return travaux.size();
    }

    public void ajouterTravail(Travail travail) {
        this.travaux.add(travail);
    }

    public Travail getTravail(int index) {
        return travaux.get(index);
    }

    private static void incrementerCompteur() {
        compteur++;
    }

    public static int getCompteur() {
        return compteur;
    }

    public static void resetCompteur() {
        compteur = 0;
    }

    @Override
    public int compareTo(CoursSession o) {
        int compareDepartement = getDepartement().compareTo(o.getDepartement());

        if (compareDepartement != 0) {
            return compareDepartement;
        }
        return getNumero().compareTo(o.getNumero());
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(String url) throws MalformedURLException {
        this.url = new URL(url);
    }
}
