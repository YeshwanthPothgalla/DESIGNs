import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Container;

import javax.swing.*;

public class ChessGame extends JFrame {
private JButton[][] squares = new JButton[8][8];
private boolean isWhiteTurn = true;

public ChessGame() {
super("Chess Game");
Container content = getContentPane();
content.setLayout(new GridLayout(8, 8));
for (int row = 0; row < 8; row++) {
    for (int col = 0; col < 8; col++) {
      squares[row][col] = new JButton();
      content.add(squares[row][col]);
  
      if ((row + col) % 2 == 0) {
        squares[row][col].setBackground(Color.WHITE);
      } else {
        squares[row][col].setBackground(Color.GRAY);
      }
  
      squares[row][col].addActionListener(new SquareListener());
    }
  }
  
  setSize(500, 500);
  setVisible(true);
}

private class SquareListener implements ActionListener {
public void actionPerformed(ActionEvent event) {
for (int row = 0; row < 8; row++) {
for (int col = 0; col < 8; col++) {
if (event.getSource() == squares[row][col]) {
if (isWhiteTurn) {
squares[row][col].setBackground(Color.WHITE);
} else {
squares[row][col].setBackground(Color.GRAY);
}
isWhiteTurn = !isWhiteTurn;
}
}
}
}{
isWhiteTurn = !isWhiteTurn;
}
}



public static void main(String[] args) {
ChessGame chess = new ChessGame();
chess.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}

