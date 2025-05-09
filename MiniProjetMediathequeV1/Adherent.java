package MiniProjetMediathequeV1;

public class Adherent {
    int id;
    String nom;

    public Adherent(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    // Deux adherents sont egaux s'ils ont le meme id
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Adherent) && ((Adherent) obj).id == this.id;
    }

    // Le hashCode est base uniquement sur l'id
    @Override
    public int hashCode() {
        return id;
    }
    @Override
    public String toString() {
        return "Adherent{id = " + id + ", nom = " + nom + "}";
    }
}
