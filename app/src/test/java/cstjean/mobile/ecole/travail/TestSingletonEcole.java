package cstjean.mobile.ecole.travail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class TestSingletonEcole {
    @Test
    public void testInstance() {
        SingletonEcole singleton1 = SingletonEcole.getInstance();
        SingletonEcole singleton2 = SingletonEcole.getInstance();
        assertSame(singleton1, singleton2);
        assertEquals(4, singleton1.getNbCoursSession());
        assertEquals("Philo 101", singleton1.getCoursSession(0).getDepartementNumero());
        singleton1.ajouterCoursSession(new CoursSession("Mobile", "101"));
        assertEquals(5, singleton1.getNbCoursSession());
        assertEquals("Mobile 101", singleton1.getCoursSession(4).getDepartementNumero());
    }
}
