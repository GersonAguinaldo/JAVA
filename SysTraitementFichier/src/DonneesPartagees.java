
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DonneesPartagees {
    // Map partagee pour stocker le nombre de mots par fichier
    private final Map<String, Integer> resultats = new ConcurrentHashMap<>();

    public void ajouterResultat(String fichier, int nombreMots) {
        resultats.put(fichier, nombreMots);
    }

    public void afficherResultats() {
        System.out.println("=== Resultats du traitement des fichiers ===");
        for (Map.Entry<String, Integer> entree : resultats.entrySet()) {
            System.out.println(entree.getKey() + " : " + entree.getValue() + " mots");
        }
    }
}
