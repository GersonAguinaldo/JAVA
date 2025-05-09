package JAVA_GRAPHIQUE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulaire extends JFrame {
    private JTextField nomField, prenomField;
    private JRadioButton hommeBtn, femmeBtn;
    private JComboBox<String> filiereCombo;
    private JCheckBox coursSoirCheck;
    private JButton validerBtn;

    public Formulaire() {
        setTitle("Formulaire d'inscription");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 300);
        setLocationRelativeTo(null); // Centrer la fenêtre

        // Layout principal
        setLayout(new BorderLayout());

        // Panel central pour les champs
        JPanel centerPanel = new JPanel(new GridLayout(6, 2, 5, 5));

        // Champs nom et prénom
        centerPanel.add(new JLabel("Nom :"));
        nomField = new JTextField();
        centerPanel.add(nomField);

        centerPanel.add(new JLabel("Prénom :"));
        prenomField = new JTextField();
        centerPanel.add(prenomField);

        // Sexe
        centerPanel.add(new JLabel("Sexe :"));
        JPanel sexePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        hommeBtn = new JRadioButton("Homme");
        femmeBtn = new JRadioButton("Femme");
        ButtonGroup sexeGroup = new ButtonGroup();
        sexeGroup.add(hommeBtn);
        sexeGroup.add(femmeBtn);
        sexePanel.add(hommeBtn);
        sexePanel.add(femmeBtn);
        centerPanel.add(sexePanel);

        // Filière
        centerPanel.add(new JLabel("Filière :"));
        filiereCombo = new JComboBox<>(new String[]{"Informatique", "Gestion", "Droit"});
        centerPanel.add(filiereCombo);

        // Cours du soir
        centerPanel.add(new JLabel("Cours du soir ?"));
        coursSoirCheck = new JCheckBox();
        centerPanel.add(coursSoirCheck);

        // Bouton valider
        validerBtn = new JButton("Valider");
        validerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afficherRecapitulatif();
            }
        });

        add(centerPanel, BorderLayout.CENTER);
        add(validerBtn, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void afficherRecapitulatif() {
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        String sexe = hommeBtn.isSelected() ? "Homme" : femmeBtn.isSelected() ? "Femme" : "Non spécifié";
        String filiere = (String) filiereCombo.getSelectedItem();
        String coursSoir = coursSoirCheck.isSelected() ? "Oui" : "Non";

        String message = String.format(
                "Nom : %s\nPrénom : %s\nSexe : %s\nFilière : %s\nCours du soir : %s",
                nom, prenom, sexe, filiere, coursSoir
        );

        JOptionPane.showMessageDialog(this, message, "Récapitulatif", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Formulaire());
    }
}
