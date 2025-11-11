package cstjean.mobile.ecole.travail;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Class Teste pour la class Travail.
 *
 * @author Isaak Fortin
 */
public class TestTravail {

    /**
     * Test la création d'un travail.
     */
    @Test
    public void testCreer() {
        Calendar dateRemise = new GregorianCalendar(2025, Calendar.SEPTEMBER, 10);
        String nomtravail1 = "TP1";
        Travail travail1 = creerTravail(nomtravail1, dateRemise);
        assertEquals(nomtravail1, travail1.getNom());
        assertEquals(dateRemise, travail1.getDateRemise());

        String nomtravail2 = "TP2";
        Travail travail2 = creerTravail(nomtravail2, dateRemise);
        assertEquals(nomtravail2, travail2.getNom());
        assertEquals(dateRemise, travail2.getDateRemise());
    }

    protected Travail creerTravail(String nom, Calendar dateRemise) {
        return new Travail(nom, dateRemise);
    }
}
