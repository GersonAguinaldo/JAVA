package JAVA_GRAPHIQUE.GestionEtudiants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnexionDB {
    public static Connection seConnecter() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/gestion_etudiants";
        String user = "root";
        String password = "";
        return DriverManager.getConnection(url, user, password);
    }
}