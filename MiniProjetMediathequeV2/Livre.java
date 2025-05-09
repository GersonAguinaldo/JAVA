package MiniProjetMediathequeV2;

public class Livre implements Comparable<Livre> {
    private String titre;
    private String auteur;
    private int annee;

    public Livre(String titre, String auteur, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }

    // Getters
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    // Pour trier par annee croissante
    @Override
    public int compareTo(Livre l1) {
        return this.annee - l1.annee; // Tri par annee croissant
    }

    // Afficher les informations du livre
    @Override
    public String toString() {
        return "Livre{titre = " + titre + ", auteur = " + auteur + ", annee=" + annee + "}";
    }


}
