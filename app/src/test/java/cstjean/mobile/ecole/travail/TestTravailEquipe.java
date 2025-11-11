package cstjean.mobile.ecole.travail;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestTravailEquipe extends TestTravail {
    @Test
    public void testAjoutCoequipier() {
        TravailEquipe travail1 = (TravailEquipe) creerTravail("TP1",
                new GregorianCalendar(2025, Calendar.SEPTEMBER, 15));
        int da1 = 123456;
        String nom1 = "coequipier1";
        travail1.ajouterCoequipier(da1, nom1);
        assertEquals(nom1, travail1.getCoequipier(da1));
        assertEquals(1, travail1.getNombreCoequipier());

        int da2 = 654321;
        String nom2 = "coequipier2";
        travail1.ajouterCoequipier(da2, nom2);
        assertEquals(nom2, travail1.getCoequipier(da2));
        assertEquals(2, travail1.getNombreCoequipier());

        assertEquals(nom1, travail1.getCoequipier(da1));
    }

    @Override
    protected Travail creerTravail(String nom, Calendar dateRemise) {
        return new TravailEquipe(nom, dateRemise);
    }
}
