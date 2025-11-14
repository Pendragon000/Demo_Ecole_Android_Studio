package cstjean.mobile.ecole.travail;

import org.jspecify.annotations.NonNull;

import java.util.Calendar;
import java.util.Objects;

/**
 * Class Travail.
 *
 * @author Isaak Fortin
 */
public class Travail implements Cloneable {
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

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Travail travail = (Travail) o;
        return Objects.equals(nom, travail.nom) && Objects.equals(dateRemise, travail.dateRemise);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nom, dateRemise);
    }
}
