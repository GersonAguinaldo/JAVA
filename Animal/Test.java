public class Test {
    public static void main(String[] args) {
        Loup leLoup = new Loup("Gris bleuté", 20);
        leLoup.boire();
        leLoup.manger();
        leLoup.deplacement();
        leLoup.crier();
        System.out.println(leLoup.toString());
    }
}
