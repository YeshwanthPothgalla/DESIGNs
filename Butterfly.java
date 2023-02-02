import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Butterfly extends JPanel {

public void paintComponent(Graphics g) {
super.paintComponent(g);
// Body of the butterfly
g.setColor(Color.ORANGE);
g.fillOval(100, 75, 200, 150);

// Left wing of the butterfly
g.setColor(Color.YELLOW);
g.fillArc(50, 75, 200, 150, 0, 180);

// Right wing of the butterfly
g.setColor(Color.MAGENTA);
g.fillArc(150, 75, 200, 150, 0, -180);

// Antenna of the butterfly
g.setColor(Color.BLACK);
g.drawLine(250, 75, 270, 95);
g.drawLine(250, 75, 230, 95);

// Mouth of the butterfly
g.setColor(Color.BLACK);
g.drawArc(175, 150, 50, 25, 180, 180);
}

public static void main(String[] args) {
JFrame frame = new JFrame();
frame.getContentPane().add(new Butterfly());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(450, 300);
frame.setVisible(true);
}
}
