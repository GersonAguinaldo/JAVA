package MiniProjet;

class Chat extends EtreVivant {
    public Chat(String nom) {
        this.nom = nom;
    }

    @Override
    void agir() {
        System.out.println("Je suis entrain d'agir comme un chat !");
    }

}