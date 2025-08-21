import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        // Ventana principal
        JFrame frame = new JFrame("Sistema de Instrumentos de Salud Mental");
        frame.setSize(650, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(new Color(240, 248, 255)); // fondo suave

        // Área de texto para mostrar instrumentos
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scroll = new JScrollPane(areaTexto);
        scroll.setBorder(BorderFactory.createTitledBorder("Instrumentos Registrados"));
        frame.add(scroll, BorderLayout.CENTER);

        // Panel lateral para inputs
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(220, 230, 241));
        panel.setBorder(BorderFactory.createTitledBorder("Agregar / Eliminar Instrumento"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Campos de entrada
        JTextField claveField = new JTextField(10);
        JTextField nombreField = new JTextField(10);
        JTextField autorField = new JTextField(10);
        JComboBox<String> tipoCombo = new JComboBox<>(new String[]{"Identificar", "Manejar"});
        JComboBox<String> condicionCombo = new JComboBox<>(new String[]{"Ansiedad", "Estrés"});

        // Etiquetas y campos
        gbc.gridx = 0; gbc.gridy = 0; panel.add(new JLabel("Clave:"), gbc);
        gbc.gridx = 1; panel.add(claveField, gbc);

        gbc.gridx = 0; gbc.gridy = 1; panel.add(new JLabel("Nombre:"), gbc);
        gbc.gridx = 1; panel.add(nombreField, gbc);

        gbc.gridx = 0; gbc.gridy = 2; panel.add(new JLabel("Autor:"), gbc);
        gbc.gridx = 1; panel.add(autorField, gbc);

        gbc.gridx = 0; gbc.gridy = 3; panel.add(new JLabel("Tipo:"), gbc);
        gbc.gridx = 1; panel.add(tipoCombo, gbc);

        gbc.gridx = 0; gbc.gridy = 4; panel.add(new JLabel("Condición:"), gbc);
        gbc.gridx = 1; panel.add(condicionCombo, gbc);

        // Botones
        JButton agregarBtn = new JButton("Agregar");
        agregarBtn.setBackground(new Color(144, 238, 144));
        JButton eliminarBtn = new JButton("Eliminar");
        eliminarBtn.setBackground(new Color(250, 128, 114));
        JButton mostrarBtn = new JButton("Mostrar");
        mostrarBtn.setBackground(new Color(173, 216, 230));

        gbc.gridx = 0; gbc.gridy = 5; panel.add(agregarBtn, gbc);
        gbc.gridx = 1; panel.add(eliminarBtn, gbc);
        gbc.gridx = 0; gbc.gridy = 6; gbc.gridwidth = 2; panel.add(mostrarBtn, gbc);

        frame.add(panel, BorderLayout.EAST);

        // Acciones de los botones
        agregarBtn.addActionListener(e -> {
            Instrumento i = new Instrumento(
                    claveField.getText(),
                    nombreField.getText(),
                    tipoCombo.getSelectedItem().toString(),
                    condicionCombo.getSelectedItem().toString(),
                    autorField.getText()
            );
            sistema.agregarInstrumento(i);
            JOptionPane.showMessageDialog(frame, "Instrumento agregado");
            areaTexto.setText(sistema.mostrarInstrumentos());
        });

        eliminarBtn.addActionListener(e -> {
            String clave = claveField.getText();
            sistema.eliminarInstrumento(clave);
            JOptionPane.showMessageDialog(frame, "Instrumento eliminado si existía");
            areaTexto.setText(sistema.mostrarInstrumentos());
        });

        mostrarBtn.addActionListener(e -> areaTexto.setText(sistema.mostrarInstrumentos()));

        frame.setVisible(true);
    }
}
