package cstjean.mobile.ecole.travail.rapport;

import cstjean.mobile.ecole.travail.CoursSession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RapportCours extends Rapport{

    private final List<CoursSession> listeCoursSession = new ArrayList<>();

    void ajouter(CoursSession coursSession) {
        listeCoursSession.add(coursSession);
    }

    public String getRapportCours() {
        StringBuilder builder = new StringBuilder();

        Collections.sort(listeCoursSession);

        for (CoursSession coursSession : listeCoursSession) {
            builder.append(coursSession.getDepartement())
                    .append(" ")
                    .append(coursSession.getNumero())
                    .append(SAUT_LIGNE);
        }
        return builder.toString();
    }
}
