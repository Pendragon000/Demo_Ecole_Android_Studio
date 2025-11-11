package cstjean.mobile.ecole.travail;

import java.util.ArrayList;
import java.util.List;

public class SingletonEcole {
    private static SingletonEcole instance = null;
    private final List<CoursSession> listeCoursSession = new ArrayList<>();

    private SingletonEcole() {
        listeCoursSession.add(new CoursSession("Philo", "101"));
        listeCoursSession.add(new CoursSession("Philo", "210"));
        listeCoursSession.add(new CoursSession("Math", "101"));
        listeCoursSession.add(new CoursSession("Français", "101"));
    }

    public static SingletonEcole getInstance() {
        if (instance == null) {
            instance = new SingletonEcole();
        }
        return instance;
    }
    public CoursSession getCoursSession(int index) {
        return listeCoursSession.get(index);
    }
    public int getNbCoursSession() {
        return listeCoursSession.size();
    }

    public void ajouterCoursSession(CoursSession cours) {
        listeCoursSession.add(cours);
    }
}
