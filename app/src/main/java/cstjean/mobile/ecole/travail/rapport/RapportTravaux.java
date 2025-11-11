package cstjean.mobile.ecole.travail.rapport;

import cstjean.mobile.ecole.travail.CoursSession;
import cstjean.mobile.ecole.travail.Travail;

import java.text.SimpleDateFormat;

public class RapportTravaux extends Rapport {
    static final String ENTETE_RAPPORT_TRAVAUX = "---------- TRAVAUX ----------";
    static final String PIEDPAGE_RAPPORT_TRAVAUX = "--------------------";

    public static String getRapportTravaux(CoursSession coursSession) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        StringBuilder builder = new StringBuilder();
        builder.append(ENTETE_RAPPORT_TRAVAUX).append(SAUT_LIGNE);
        for (int i = 0; i < coursSession.getNombreTravaux(); i++) {
            Travail travail = coursSession.getTravail(i);
            builder.append(travail.getNom())
                    .append(" - ")
                    .append(sdf.format(travail.getDateRemise().getTime()))
                    .append(SAUT_LIGNE);
        }

        builder.append("Total : ")
                        .append(coursSession.getNombreTravaux())
                .append(SAUT_LIGNE);
        builder.append(PIEDPAGE_RAPPORT_TRAVAUX);
        return builder.toString();
    }
}
