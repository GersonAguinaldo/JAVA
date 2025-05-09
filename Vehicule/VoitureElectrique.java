package Vehicule;

class VoitureElectrique extends Vehicule implements Electrique {

    public VoitureElectrique(String marque) {
        this.marque = marque;
    }

    public void afficherType() {
        System.out.println("je suis de type " + this.getClass() + " et je suis " + this.marque);
    }

    @Override
    public void recharger() {
        System.out.println("Je me recharge");
    }

}
