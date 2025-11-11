package cstjean.mobile.ecole.travail;

import java.util.Calendar;

/**
 * Class Travail.
 *
 * @author Isaak Fortin
 */
public class Travail {
    /**
     * Le nom du travail.
     */
    private final String nom;
    /**
     * La date à remmetre le trvail.
     */
    private final Calendar dateRemise;

    /**
     * Constructeur par défaut de la classe Travail.
     *
     * @param nom Le nom du travail.
     * @param dateRemise La date à remettre le travail.
     */
    public Travail(String nom, Calendar dateRemise) {
        this.nom = nom;
        this.dateRemise = dateRemise;
    }

    public String getNom() {
        return nom;
    }

    public Calendar getDateRemise() {
        return dateRemise;
    }
}
