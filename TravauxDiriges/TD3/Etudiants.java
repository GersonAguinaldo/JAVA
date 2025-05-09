package TravauxDiriges.TD3;

import java.util.HashMap;
import java.util.Map;

public class Etudiants {

    public static void main(String[] args) {
        Map<String, Integer> notesEtudiant = new HashMap<>();
        notesEtudiant.put("Georges RAPONTCHOMBO ", 19);
        notesEtudiant.put("Pierre MAKOSSO ", 19);
        notesEtudiant.put("Aguinaldo SACAMA ", 17);
        notesEtudiant.put("Odette LOKOSSOU ", 18);

        System.out.println(notesEtudiant);
    }
}
