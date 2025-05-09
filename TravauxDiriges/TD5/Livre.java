package TravauxDiriges.TD5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Livre implements Comparable<Livre>, Comparator<Livre> {
    String nom;
    String Auteur;
    int annee;
    public Livre(String nom, String Auteur, int annee){
        this.nom = nom;
        this.Auteur = Auteur;
        this.annee = annee;
    }
    public static void main(String[] args) {

        //Creation du tableau
        List<Livre> livres = new ArrayList<>();

        //Ajouter des elements dans le tableau livres
        livres.add(new Livre("Merveille du monde", "Gerson", 2003));
        livres.add(new Livre("Ton Gazo","Aguinaldo", 2023));
        livres.add(new Livre("Le sang", "SACAMA",2015));
        livres.add(new Livre("livrex", "X",2004));
        livres.add(new Livre("livrez", "z",2006));
        livres.add(new Livre("livrey", "Y",2005));



        //Affichage de la liste
        System.out.println(livres);

        //Trie par annee croissante
        Collections.sort(livres);
        System.out.println("Trie par annee : ");
        System.out.println(livres);


        //Trie par auteur alphabetique et Affichage
        Collections.sort(livres,new ComparateurNom());
        System.out.println("Trie par nom d'auteur : ");
        System.out.println(livres);


    }

    @Override
    public int compareTo(Livre l1) {
        return this.annee - l1.annee; // Tri par annee croissant
    }

    @Override
    public int compare(Livre p1, Livre p2) {
        return p1.nom.compareTo(p2.nom);
    }
    @Override
    public String toString() {
        return nom + " (de "+ Auteur +" en " + annee + ")";
    }
}
