package TravauxDiriges2.TD1;

public class Compte {
    private int solde;
    public Compte(int solde) {
        this.solde = solde;
    }
    public synchronized void retirer(int montant) {
        if (solde >= montant) {
            solde-= montant;
        }
    }
    public int getSolde() {
        return solde;
    }
    static final Object ressourceA = new Object();
    static final Object ressourceB = new Object();
    public static void main(String[] args) {
        Thread client1 = new Thread(() -> {
            synchronized (ressourceA) {
                System.out.println("Client 1 a verrouillé ressource A");
                try { Thread.sleep(100); } catch
                (InterruptedException e) {}
                synchronized (ressourceB) {
                    System.out.println("Client 1 a verrouillé ressource B");
                }
            }
        });
        Thread client2 = new Thread(() -> {
            synchronized (ressourceB) {
                System.out.println("Client 2 a verouille ressource B");
                try { Thread.sleep(100); } catch
                (InterruptedException e) {}
                synchronized (ressourceA) {
                    System.out.println("Client 2 a verrouillé ressource A");
                }
            }
        });
        client1.start();
        client2.start();
    }
}
