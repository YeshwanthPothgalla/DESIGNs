import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChessBoard extends JPanel implements MouseListener {

private static final long serialVersionUID = 1L;
private static final int ROWS = 8;
private static final int COLUMNS = 8;
private static final int SIZE = 80;

private Point pointClicked;
private boolean isWhite;

public ChessBoard() {
addMouseListener(this);
}

public void paintComponent(Graphics g) {
super.paintComponent(g);
    
for (int row = 0; row < ROWS; row++) {
    for (int col = 0; col < COLUMNS; col++) {
      int x = col * SIZE;
      int y = row * SIZE;
  
      if (row % 2 == col % 2) {
        g.setColor(Color.WHITE);
      } else {
        g.setColor(Color.GRAY);
      }
  
      g.fillRect(x, y, SIZE, SIZE);
    }
  }
  
  if (pointClicked != null) {
    int x = pointClicked.x - SIZE / 2;
    int y = pointClicked.y - SIZE / 2;
  
    if (isWhite) {
      g.setColor(Color.WHITE);
    } else {
      g.setColor(Color.GRAY);
    }
  
    g.fillOval(x, y, SIZE, SIZE);
  }
}

public static void main(String[] args) {
JFrame frame = new JFrame();
frame.getContentPane().add(new ChessBoard());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(ROWS * SIZE, COLUMNS * SIZE);
frame.setVisible(true);
}
public void mouseClicked(MouseEvent e) {
    int x = e.getX();
    int y = e.getY();
    pointClicked = new Point(x, y);
isWhite = !isWhite;

repaint();
}

public void mousePressed(MouseEvent e) {
}

public void mouseReleased(MouseEvent e) {
}

public void mouseEntered(MouseEvent e) {
}

public void mouseExited(MouseEvent e) {
}
}
