package JAVA_GRAPHIQUE;

import javax.swing.*;
import java.awt.event.*;
public class ExempleBouton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener Exemple");
        JButton bouton = new JButton("Clique ici");
        bouton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bouton cliqué !");
            }
        });
        frame.add(bouton);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
