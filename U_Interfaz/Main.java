import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main {

    private static final int INTERVALO_CAMBIO_COLOR = 20; // Intervalo en milisegundos
    private static final int PASO_COLOR = 5;
    
    public static void main(String[] args) {
        // Frame
        JFrame frame = new JFrame(":VVVvvvVV");
        frame.setSize(800, 600);

        // Configurar color de fondo antes de agregar el panel al contenedor principal

        // Creacion del panel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.yellow);

        // Creacion del font para las letras
        Font font = new Font("Arial", Font.CENTER_BASELINE, 20);

        // Creacion del label
        JLabel label = new JLabel("papu papu tienes una videollamada contesta papu :vvvVV");
        label.setFont(font);

        // Carga de la imagen
        ImageIcon icon = new ImageIcon("./images.png");
        JLabel imagen = new JLabel(icon);

        // Botones
        JButton boton1 = new JButton("", icon);



        panel.add(boton1);
        panel.add(imagen);
        panel.add(label);

        // Agregar el panel al contenedor principal
        frame.getContentPane().add(panel);

        // Configurar el cierre de la ventana
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });

        Timer timer = new Timer(INTERVALO_CAMBIO_COLOR, new ActionListener() {
            private int red = 255;
            private int green = 0;
            private int blue = 0;
            private boolean increaseRed = false;
            private boolean increaseGreen = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (increaseRed) {
                    red += PASO_COLOR;
                } else {
                    red -= PASO_COLOR;
                }
                if (increaseGreen) {
                    green += PASO_COLOR;
                } else {
                    green -= PASO_COLOR;
                }
                if (red >= 255 || red <= 0) {
                    increaseRed = !increaseRed;
                }
                if (green >= 255 || green <= 0) {
                    increaseGreen = !increaseGreen;
                }
                panel.setBackground(new Color(red, green, blue));
            }
        });

        // Iniciar el temporizador
        timer.start();

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
