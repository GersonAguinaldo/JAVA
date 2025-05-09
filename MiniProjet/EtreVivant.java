package MiniProjet;

public abstract class EtreVivant {
    protected String nom;

    public void afficherNom() {
        System.out.println("Je m'appelle : " + this.nom);
    }

    abstract void agir();
}
