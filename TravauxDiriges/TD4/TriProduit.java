package TravauxDiriges.TD4;

import java.util.*;

public class TriProduit {

    public static void main(String[] args) {
        List<Produit> produits = new ArrayList<>();
        produits.add(new Produit("Viande", 30));
        produits.add(new Produit("Poisson", 25));
        produits.add(new Produit("Oeuf", 35));
        Collections.sort(produits);
        System.out.println("Trie par prix : ");
        System.out.println(produits);
        Collections.sort(produits, new ComparateurNom());
        System.out.println("Trie par nom : ");
        System.out.println(produits);
    }
}