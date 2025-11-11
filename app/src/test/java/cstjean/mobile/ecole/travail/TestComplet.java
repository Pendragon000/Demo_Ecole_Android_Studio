package cstjean.mobile.ecole.travail;

import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import cstjean.mobile.ecole.travail.rapport.TestRapportCours;
import cstjean.mobile.ecole.travail.rapport.TestRapportTravaux;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestRapportCours.class,
        TestRapportTravaux.class,
        TestCoursSession.class,
        TestTravail.class,
        TestTravailEquipe.class
})
public class TestComplet {

}
