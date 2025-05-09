package TravauxDiriges.TD1;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Pays {

    public static void main(String[] args) {
        List<String> pays = new ArrayList<>();

        pays.add("Angola");
        pays.add("Cameroun");
        pays.add("Gabon");
        pays.add("Cameroun"); // Doublon autorisé
        pays.add("Angola"); // Doublon autorisé

        Iterator<String> it = pays.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
