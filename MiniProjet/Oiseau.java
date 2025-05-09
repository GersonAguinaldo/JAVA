package MiniProjet;

class Oiseau extends EtreVivant implements Volant {
    public Oiseau(String nom) {
        this.nom = nom;
    }

    @Override
    void agir() {
        System.out.println("Je suis entrain d'agir comme un oiseau !");
    }

    @Override
    public void voler() {
        System.out.println("Je suis entrain de planer dans le vent !");
    }

}
