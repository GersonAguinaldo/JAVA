package MiniProjetMediathequeV3;
import java.util.*;

public class MediathequeApp {

    private ArrayList<Livre> livres = new ArrayList<>();
    private HashSet<Adherent> adherents = new HashSet<>();
    private HashMap<Adherent, List<Livre>> emprunts = new HashMap<>();

    // Fonction pour ajouter un livre
    public void ajouterLivre(Livre livre) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nom : ");
        String nom = scanner.nextLine();
        System.out.print("Auteur : ");
        String auteur = scanner.nextLine();
        System.out.print("Année de publication: ");
        int annee = scanner.nextInt();
        while (annee < 0){
            System.out.println("L'année ne peut pas être inférieur à 0;");
            System.out.print("Entrez une année valide: ");
            annee = scanner.nextInt();
        }
        livres.add(livre);
    }

    // Fonction pour ajouter un adherent
    public void ajouterAdherent(Adherent adherent) {
        adherents.add(adherent);
    }

    // fonction pour ennregistrer un emprunt
    public void emprunterLivre(Adherent adherent, Livre livre) {
        if (!emprunts.containsKey(adherent)) {
            emprunts.put(adherent, new ArrayList<>());
        }
        emprunts.get(adherent).add(livre);
    }

    // fonction pour afficher les livres empruntes par chaque adherent
    public void afficherEmprunts() {
        for (Adherent a : emprunts.keySet()) {
            System.out.println("Adherent : " + a);
            for (Livre l : emprunts.get(a)) {
                System.out.println("    " + l);
            }
        }
    }

    // fonction pour trier les livres par titre
    public void trierParTitre() {
        livres.sort(Comparator.comparing(Livre::getTitre));
    }

    // fonction pour trier les livres par auteur
    public void trierParAuteur() {
        livres.sort(Comparator.comparing(Livre::getAuteur));
    }

    // fonction pour trier par annee (Comparable)
    public void trierParAnnee() {
        Collections.sort(livres);
    }

    public void Menu() {
        System.out.println("************** Menu **************");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("************** 0 **************");
    }






    public static void main(String[] args) {

        //Creation d'une mediatheque
        MediathequeApp app = new MediathequeApp();

        // Creeation des livres
        Livre l1 = new Livre("livrey", "Y",2004);
        Livre l2 = new Livre("livrex", "X",2006);
        Livre l3 = new Livre("livrez", "Z",2005);

        Adherent a1 = new Adherent(1, "Gerson");
        Adherent a2 = new Adherent(2, "Aguinaldo");

        //Ajout des livres
        app.ajouterLivre(l1);
        app.ajouterLivre(l2);
        app.ajouterLivre(l3);

        //Ajout des adherents
        app.ajouterAdherent(a1);
        app.ajouterAdherent(a2);

        //les emprunts
        app.emprunterLivre(a1, l1);
        app.emprunterLivre(a1, l2);
        app.emprunterLivre(a2, l3);

        System.out.println("\n--- Emprunts ---");
        app.afficherEmprunts();

        System.out.println("\n--- Livres tries par titre ---");
        app.trierParTitre();
        app.livres.forEach(System.out::println);

        System.out.println("\n--- Livres tries par auteur ---");
        app.trierParAuteur();
        app.livres.forEach(System.out::println);

        System.out.println("\n--- Livres tries par annee ---");
        app.trierParAnnee();
        app.livres.forEach(System.out::println);

    }
}
















