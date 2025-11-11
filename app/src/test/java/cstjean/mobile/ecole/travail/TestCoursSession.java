package cstjean.mobile.ecole.travail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Classe de test de la classe CoursSession.
 */
public class TestCoursSession {

    private CoursSession coursSession;

    @Before
    public void setUp() {
        coursSession = new CoursSession("Philo", "101");
    }
    /**
     * Methode qui teste la création d'un cours session.
     */
    @Test
    public void testCreer() {
        String departement = "Philo";
        String numero = "101";
        assertEquals(departement, coursSession.getDepartement());
        assertEquals(numero, coursSession.getNumero());
        assertEquals("Philo 101", coursSession.getDepartementNumero());
        assertEquals(0,coursSession.getNombreTravaux());
    }

    /**
     * Methode qui teste l'ajout de travail dans un cours session.
     */
    @Test
    public void testAjoutTravail() {

        String nomTravail1 = "TP1";
        Calendar dateRemise = new GregorianCalendar(2025, Calendar.SEPTEMBER, 10);
        Travail travail1 = new Travail(nomTravail1, dateRemise);
        coursSession.ajouterTravail(travail1);
        assertEquals(1, coursSession.getNombreTravaux());
        assertEquals(travail1, coursSession.getTravail(0));

        String nomTravail2 = "TP2";
        Travail travail2 = new Travail(nomTravail2, dateRemise);
        coursSession.ajouterTravail(travail2);
        assertEquals(2, coursSession.getNombreTravaux());
        assertEquals(travail1, coursSession.getTravail(0));
        assertEquals(travail2, coursSession.getTravail(1));
    }

    @Test
    public void testCompteur() {
        CoursSession.resetCompteur();
        assertEquals(0,coursSession.getCompteur());

        new CoursSession("Philo", "101");
        assertEquals(1, CoursSession.getCompteur());

        new CoursSession("Philo", "101");
        assertEquals(2, CoursSession.getCompteur());

        new CoursSession("Philo", "101");
        assertEquals(3, CoursSession.getCompteur());

        coursSession.resetCompteur();
        assertEquals(0, coursSession.getCompteur());
    }

    @Test
    public void testCompare() {
        assertEquals(0, coursSession.compareTo(new CoursSession("Philo", "101")));
        assertTrue(coursSession.compareTo(new CoursSession("Philo", "201")) < 0);
        assertTrue(coursSession.compareTo(new CoursSession("Math", "201")) > 0);
    }

    @Test
    public void testURL() throws MalformedURLException {
        final String url = "https://www.cstjean.qc.ca/philo101";
        coursSession.setUrl(url);
        assertEquals(url, coursSession.getUrl().toString());
    }
}
