package JAVA_GRAPHIQUE.GestionEtudiants;

public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    public Etudiant(String nom, String prenom, String email)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }
    public Etudiant(int id, String nom, String prenom, String
            email) {
        this(nom, prenom, email);
        this.id = id;
    }
    // Getters
    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getEmail() { return email; }
}
