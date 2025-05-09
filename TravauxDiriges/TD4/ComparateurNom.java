package TravauxDiriges.TD4;

import java.util.Comparator;

public class ComparateurNom implements Comparator<Produit> {
    @Override
    public int compare(Produit p1, Produit p2) {
        return p1.nom.compareTo(p2.nom);
    }
}
