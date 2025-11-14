package cstjean.mobile.ecole.travail;

public class Joueur implements Cloneable {
    private String nom;
    private int numero;
    public Joueur(String nom, int numero) {
        this.nom = nom;
        this.numero = numero;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
