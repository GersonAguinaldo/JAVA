package MiniProjet;

class Chien extends EtreVivant {
    public Chien(String nom) {
        this.nom = nom;
    }

    @Override
    void agir() {
        System.out.println("Je suis entrain d'agir comme un chien !");
    }

}
