package JAVA_GRAPHIQUE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MiniCalculatrice {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Additionneur");
        frame.setLayout(new FlowLayout());
        JTextField champ1 = new JTextField(5);
        JTextField champ2 = new JTextField(5);
        JButton calculer = new JButton("Additionner");
        JLabel resultat = new JLabel("Résultat : ");
        calculer.addActionListener(e -> {
            int a = Integer.parseInt(champ1.getText());
            int b = Integer.parseInt(champ2.getText());
            resultat.setText("Résultat : " + (a + b));
        });
        frame.add(champ1);
        frame.add(champ2);
        frame.add(calculer);
        frame.add(resultat);
        frame.setSize(300, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}