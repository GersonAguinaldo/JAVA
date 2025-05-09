package Vehicule;

abstract class Vehicule {
    protected String marque;

    abstract void afficherType();

    String getMarque() {
        return this.marque;
    }

}
