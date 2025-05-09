package Vehicule;

public class Test {
    public static void main(String[] args) {
        VoitureElectrique Ford = new VoitureElectrique("Ford");
        Vehicule Merco = new VoitureElectrique("Mercedes");
        // Electrique Audi = new VoitureElectrique();
        Ford.afficherType();
        Merco.afficherType();
        Ford.recharger();
        // Audi.afficherType(); ici y a une erreur parce que c'est Electrique
    }
}
