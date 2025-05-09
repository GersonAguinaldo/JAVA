package JAVA_GRAPHIQUE;

import javax.swing.*;
import java.awt.*;

public class maPremiereFenetre {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ma première fenêtre");
        frame.setBackground(Color.BLUE);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}