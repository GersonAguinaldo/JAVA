package TravauxDiriges.TD5;

import java.util.Comparator;

public class ComparateurNom implements Comparator<Livre> {
    @Override
    public int compare(Livre p1, Livre p2) {
        return p1.Auteur.compareTo(p2.Auteur);
    }
}
