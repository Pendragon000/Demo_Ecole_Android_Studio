package cstjean.mobile.ecole.travail;

public class Equipe implements Cloneable {
    private String nom;
    private LinkedList<Joueur> listeJoueurs = new LinkedList<>();
    public Equipe(String nom) {
        this.nom = nom;
    }
    public void ajouterJoueur(Joueur joueur) {
        this.listeJoueurs.add(joueur);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
