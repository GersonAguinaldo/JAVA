package MiniProjetMediathequeV2;
import java.util.*;

public class MediathequeApp {

    private ArrayList<Livre> livres = new ArrayList<>();
    private HashSet<Adherent> adherents = new HashSet<>();
    private HashMap<Adherent, List<Livre>> emprunts = new HashMap<>();

    // Fonction pour ajouter un livre
    public void ajouterLivre(Livre livre) {
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
    public void afficherEmprunts(MediathequeApp m) {
        System.out.println("\n--- Emprunts ---");
        m.afficherEmprunts();
    }

    // fonction pour trier les livres par titre
    public void trierParTitre() {
        livres.sort(Comparator.comparing(Livre::getTitre));
    }
    public static void trierParTitre(MediathequeApp m) {
        System.out.println("\n--- Livres tries par titre ---");
        m.trierParTitre();
        m.livres.forEach(System.out::println);
    }

    // fonction pour trier les livres par auteur
    public void trierParAuteur() {
        livres.sort(Comparator.comparing(Livre::getAuteur));
    }
    public static void trierParAuteur (MediathequeApp m) {
        System.out.println("\n--- Livres tries par auteur ---");
        m.trierParAuteur();
        m.livres.forEach(System.out::println);
    }


    // fonction pour trier par annee (Comparable)
    public void trierParAnnee() {
        Collections.sort(livres);
    }
    public static void trierParAnnee(MediathequeApp m) {
        System.out.println("\n--- Livres tries par annee ---");
        m.trierParAnnee();
        m.livres.forEach(System.out::println);
    }


    public static void main(String[] args) {

        //Creation d'une mediatheque
        MediathequeApp app = new MediathequeApp();

        // Creeation des livres
        Livre l1 = new Livre("Merveille du monde", "Gerson", 2003);
        Livre l2 = new Livre("pere riche pere pauvre", "Robert T Kiosaki",2006);
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

        boolean b = true;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Ajouter un un adherent");
            System.out.println("3. Ajouter un emprunt");
            System.out.println("4. Vérifier les emprunts effectués");
            System.out.println("5. Trier les livres");
            System.out.println("0. Quitter");
            System.out.println("\nVotre choix :");

            Scanner sc = new Scanner(System.in);
            int choix = sc.nextInt();

            switch(choix) {
                case 1: {
                    //Ajouter des livres
                    System.out.println("Fonctionnalite en cours de construction !");
                    }
                break;
                case 2:{
                     //Ajouter des adherents
                    System.out.println("Fonctionnalite en cours de construction !");
                }
                break;

                case 3: {
                    //Associer des emprunts
                    System.out.println("Fonctionnalite en cours de construction !");
                    }
                break;
                case 4: {
                    //Afficher les livres empruntes par chaque adherent
                    app.afficherEmprunts();
                }
                break;
                case 5: {
                    System.out.println("\n--- Comment voulez vous trier ? ---");
                    System.out.println("\n1. Par titre");
                    System.out.println("\n2. Par Auteur");
                    System.out.println("\n3. Par annee");
                    System.out.println("\nVotre choix :");
                    int c = sc.nextInt();

                    switch (c) {
                        case 1:
                            trierParTitre(app);
                            break;
                        case 2:
                            trierParAuteur(app);
                            break;
                        case 3:
                            trierParAnnee(app);
                            break;
                        default:
                            break;
                    }
                }
                break;
                case 0:
                     b = false;
                     break;
                default: break;
            }
        }while (b);
    }
}
