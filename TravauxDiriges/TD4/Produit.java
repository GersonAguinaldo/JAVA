package TravauxDiriges.TD4;

import java.util.Comparator;

public class Produit implements Comparable<Produit>, Comparator<Produit> {

    String nom;
    private int prix;

    public Produit(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public int compareTo(Produit autre) {
        return this.prix - autre.prix; // Tri par prix croissant
    }

    @Override
    public String toString() {
        return nom + " (" + prix + ")";
    }

    @Override
    public int compare(Produit p1, Produit p2) {
        return p1.nom.compareTo(p2.nom);
    }
}
