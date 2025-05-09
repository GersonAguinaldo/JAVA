package JAVA_GRAPHIQUE.GestionEtudiants;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EtudiantDAO dao = new EtudiantDAO();
        int choix;

        do {
            System.out.println("\n--- GESTION DES ÉTUDIANTS ---");
            System.out.println("1. Ajouter un étudiant");
            System.out.println("2. Lister les étudiants");
            System.out.println("3. Modifier un étudiant");
            System.out.println("4. Supprimer un étudiant");
                                                    System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine(); // nettoyage

            try {
                switch (choix) {
                    case 1:
                        System.out.print("Nom : ");
                        String nom = sc.nextLine();
                        System.out.print("Prénom : ");
                        String prenom = sc.nextLine();
                        System.out.print("Email : ");
                        String email = sc.nextLine();
                        dao.ajouter(new Etudiant(nom, prenom, email));
                        System.out.println(" Étudiant ajouté !");
                        break;
                    case 2:
                        for (Etudiant e : dao.lister()) {
                            System.out.println(e.getId() + " - " + e.getNom() + " " + e.getPrenom() + " (" + e.getEmail() + ")");
                        }
                        break;
                    case 3:
                        System.out.print("ID à modifier : ");
                        int idModif = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nouveau nom : ");
                        String nNom = sc.nextLine();
                        System.out.print("Nouveau prénom : ");
                        String nPrenom = sc.nextLine();
                        System.out.print("Nouvel email : ");
                        String nEmail = sc.nextLine();
                        dao.modifier(new Etudiant(idModif, nNom, nPrenom, nEmail));
                        System.out.println("Étudiant modifié !");
                        break;
                    case 4:
                        System.out.print("ID à supprimer : ");
                        int idSup = sc.nextInt();
                        sc.nextLine();
                        dao.supprimer(idSup);
                        System.out.println("Étudiant supprimé.");
                }
                break;
            } catch (Exception e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        } while (choix != 0);
        sc.close();
        System.out.println("Bye ");
    }
        }

