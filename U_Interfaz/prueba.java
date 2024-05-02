package Java.U_Interfaz;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import javafx.scene.control.Label;

public class prueba {
    JFrame frame = new JFrame("Hola perras");
    final JLabel label = new JLabel("Hola nenas como andan perritas");
    frame.getContentPane().add(label);

    frame.addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });

    frame.pack();
    frame.setVisible(true);

}
