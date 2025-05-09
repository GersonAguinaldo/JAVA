package MiniProjet;

public abstract class Vehicule {

    protected String marque;

    public void afficherMarque() {
        System.out.println("Je suis de la marque : " + this.marque);
    }

    abstract void deplacer();
}
