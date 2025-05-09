package TravauxDiriges.TD2;

import java.util.HashSet;
import java.util.Set;

public class Couleurs {

    public static void main(String[] args) {
        Set<String> couleurs = new HashSet<>();
        couleurs.add("Noir");
        couleurs.add("Jaune");
        couleurs.add("Rouge");
        couleurs.add("Noir"); // Ignore
        couleurs.add("Rouge"); // Ignore

        for (String couleur : couleurs) {
            System.out.println(couleur);
        }
    }
}
