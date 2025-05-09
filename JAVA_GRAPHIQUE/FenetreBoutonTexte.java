package JAVA_GRAPHIQUE;

//import javax.swing.*;
//public class maPremiereFenetre {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Ma première fenêtre");
//        frame.setSize(300, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class FenetreBoutonTexte extends JFrame implements ActionListener{
    private JTextField textField;
    public FenetreBoutonTexte(){
        setTitle("Bouton et Texte");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        textField = new JTextField(20);
        JButton button = new JButton("Cliquez ici");
        button.addActionListener(this);
        add(textField);
        add(button);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Random rand = new Random();
        textField.setBackground(Color.red);

    }
    public static void main(String[] args) {
        new FenetreBoutonTexte().setVisible(true);
    }
}