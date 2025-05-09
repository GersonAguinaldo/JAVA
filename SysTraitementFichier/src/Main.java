public class Main {
    public static void main(String[] args) {
        // Liste simulée de fichiers (juste les noms ici)
        String[] nomsFichiers = {"fichier1.txt", "fichier2.txt", "fichier3.txt"};

        // Lancer le traitement parallèle
        GestionnaireFichiers.lancerTraitement(nomsFichiers);
    }
}