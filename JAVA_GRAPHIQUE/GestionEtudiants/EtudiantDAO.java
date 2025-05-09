package JAVA_GRAPHIQUE.GestionEtudiants;

import java.sql.*;
import java.util.ArrayList;

public class EtudiantDAO {
    public void ajouter(Etudiant e) throws SQLException {
        Connection conn = ConnexionDB.seConnecter();
        String sql = "INSERT INTO etudiants(nom, prenom, email) VALUES (?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, e.getNom());
        pst.setString(2, e.getPrenom());
        pst.setString(3, e.getEmail());
        pst.executeUpdate();
        conn.close();
    }
    public ArrayList<Etudiant> lister() throws SQLException {
        ArrayList<Etudiant> liste = new ArrayList<>();
        Connection conn = ConnexionDB.seConnecter();
        String sql = "SELECT * FROM etudiants";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            liste.add(new Etudiant(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("prenom"),
                    rs.getString("email")
            ));
        }
        conn.close();
        return liste;
    }
    public void modifier(Etudiant e) throws
            SQLException {
        Connection conn = ConnexionDB.seConnecter();
        String sql = "UPDATE etudiants SET nom=?, prenom=?, email=? WHERE id=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, e.getNom());
        pst.setString(2, e.getPrenom());
        pst.setString(3, e.getEmail());
        pst.setInt(4, e.getId());
        pst.executeUpdate();
        conn.close();
    }
    public void supprimer(int id) throws SQLException {
        Connection conn = ConnexionDB.seConnecter();
        String sql = "DELETE FROM etudiants WHERE id=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        pst.executeUpdate();
        conn.close();
    }
}
