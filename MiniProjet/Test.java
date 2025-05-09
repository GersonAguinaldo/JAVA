package MiniProjet;

public class Test {
    public static void main(String[] args) {

        // Creation des objets
        Chien Chien1 = new Chien("Wouf Wouf");
        Chat Chat1 = new Chat("Miaous");
        Oiseau oiseau1 = new Oiseau("Piou Piou");
        VoitureElectrique Merco = new VoitureElectrique("Mercedes");
        Avion Avion1 = new Avion("Air Force One");

        // Appel des fonctions

        // Fonctions Etres vivants
        Chien1.afficherNom();
        Chien1.agir();
        System.out.println();

        Chat1.afficherNom();
        Chat1.agir();
        System.out.println();

        oiseau1.afficherNom();
        oiseau1.agir();
        oiseau1.voler();
        System.out.println();

        // Fonctions Vehicules
        Merco.afficherMarque();
        Merco.deplacer();
        Merco.recharger();
        System.out.println();

        Avion1.afficherMarque();
        Avion1.deplacer();
        Avion1.voler();
    }
}
