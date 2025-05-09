import java.util.Random;

public class TacheFichier implements Runnable {
    private final String nomFichier;
    private final DonneesPartagees donnees;

    public TacheFichier(String nomFichier, DonneesPartagees donnees) {
        this.nomFichier = nomFichier;
        this.donnees = donnees;
    }

    public void run() {
        // Simulation de lecture du contenu du fichier
        String contenu = simulerLectureFichier();
        int nombreMots = compterMots(contenu);

        // Stocker les resultats dans la Map partagée
        donnees.ajouterResultat(nomFichier, nombreMots);
    }

    // Cette methode simule la lecture du contenu d'un fichier
    private String simulerLectureFichier() {
        String[] phrases = {
                "Ceci est un fichier de test avec plusieurs mots",
                "Un autre fichier avec du contenu simule",
                "Java est un langage tres puissant.",
        };
        Random rand = new Random();
        return phrases[rand.nextInt(phrases.length)];
    }

    private int compterMots(String texte) {
        if (texte == null || texte.isEmpty()) return 0;
        return texte.trim().split("\\s+").length;
    }
}
