import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GestionnaireFichiers {
    public static void lancerTraitement(String[] fichiers) {
        ExecutorService service = Executors.newFixedThreadPool(fichiers.length);
        DonneesPartagees resultats = new DonneesPartagees();

        for (String fichier : fichiers) {
            TacheFichier tache = new TacheFichier(fichier, resultats);
            service.submit(tache);
        }

        service.shutdown();
        while (!service.isTerminated()) {
            // On attend que tous les threads finissent
        }

        // Affichage final des resultats
        resultats.afficherResultats();
    }
}
