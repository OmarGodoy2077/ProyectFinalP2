package org.example.Grafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.example.Clases.Usuario;
import org.example.Clases.SessionBZP;

public class Graphics extends JFrame {

    // Componentes de la GUI
    private JTextField txtUsername;
    private JButton btnUsuario;
    private JPanel login;
    private JPasswordField passwordField1;



    // Punto de entrada de la aplicación
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Graphics gui = new Graphics();
                gui.setVisible(true);
            }
        });
    }
    // Constructor para inicializar la GUI
    public Graphics() {
        super("Inicia Sesión");

        // Configuraciones básicas de la ventana
        setContentPane(login);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        pack();

        // Añadir ActionListener al botón
        btnUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnLoginActionPerformed(e);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }


    public class VentanaPrincipal extends JFrame {
        public VentanaPrincipal() {
            setTitle("Dashboard");
            setSize(800, 600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            // ... otros componentes y configuraciones ...
        }
    }

    private void btnLoginActionPerformed(ActionEvent evt) {
        String username = txtUsername.getText();
        String password = new String(passwordField1.getPassword());

        Usuario usuario = SessionBZP.verificarLogin(username, password);
        if (usuario != null) {
            // Acceso permitido. Aquí puedes mostrar la ventana principal o dashboard
            new VentanaPrincipal().setVisible(true);
            this.dispose(); // Cierra la ventana de inicio de sesión
        } else {
            JOptionPane.showMessageDialog(this, "Nombre de usuario o contraseña incorrectos");
        }
    }


}
