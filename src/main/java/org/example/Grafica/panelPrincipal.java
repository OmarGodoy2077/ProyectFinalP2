package org.example.Grafica;

import javax.swing.*;

public class VentanaPrincipal extends JFrame {

    private JPanel panelPrincipal;

    public VentanaPrincipal() {
        setTitle("Dashboard");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(panelPrincipal);
        pack();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
