import javax.swing.*;
import java.awt.*;

public class PentagonDemo extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Lógica para dibujar el pentágono
        int[] xPoints = {100, 150, 300, 350, 225};
        int[] yPoints = {250, 350, 350, 250, 150};
        int nPoints = 5;

        g.drawPolygon(xPoints, yPoints, nPoints);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Pentagon Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 600);
            
            JPanel panel = new PentagonDemo(); // Usa la clase actual en lugar de PentagonPanel
            frame.add(panel, BorderLayout.CENTER);

            frame.setVisible(true);
        });
    }
}
