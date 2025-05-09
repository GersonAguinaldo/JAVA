package JAVA_GRAPHIQUE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExempleBouton2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener Exemple");
        JButton bouton = new JButton("Clique ici");
        bouton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Bouton cliqué !");
            }
        });
        frame.add(bouton);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        bouton.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                bouton.setBackground(Color.yellow);
                System.out.println("Mouse Clicked !");
            }
            public void mouseEntered(MouseEvent e) {
                bouton.setBackground(Color.BLUE);
                System.out.println("Mouse Entered !");
            }
            public void mouseExited(MouseEvent e) {
                bouton.setBackground(Color.RED);
                System.out.println("Mouse Exited !");
            }
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed !");
            }
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released !");
            }

        });
    }


}
