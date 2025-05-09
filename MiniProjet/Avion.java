package MiniProjet;

public class Avion extends Vehicule implements Volant {
    public Avion(String marque) {
        this.marque = marque;
    }

    @Override
    public void voler() {
        System.out.println("Je suis entrain de voler dans le ciel !");
    }

    @Override
    public void deplacer() {
        System.out.println("Je suis entrain de me deplacer !");
    }
}