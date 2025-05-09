package MiniProjet;

class VoitureElectrique extends Vehicule implements Electrique {
    public VoitureElectrique(String marque) {
        this.marque = marque;
    }

    @Override
    public void recharger() {
        System.out.println("Je suis entrain de me recharger !");
    }

    @Override
    public void deplacer() {
        System.out.println("Je suis entrain de me deplacer !");
    }

}