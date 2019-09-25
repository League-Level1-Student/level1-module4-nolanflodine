package _05_typing_tutor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingRunner implements KeyListener {
static JFrame frame = new JFrame();
static JPanel panel = new JPanel();
static JLabel label = new JLabel();
static char currentLetter;

public static void main(String[] args) {
	typingRunner r = new typingRunner();
currentLetter = generateRandomLetter1();
label.setText(currentLetter+"");
r.idk();
}


static char generateRandomLetter1() {
      Random r = new Random();
      return (char) (r.nextInt(26) + 'a');
}
 void idk() {
	frame.add(panel);
	panel.add(label);
	frame.addKeyListener(this);
	label.setFont(label.getFont().deriveFont(300.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.setVisible(true);
	frame.pack();
	
}


@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
 	System.out.println(arg0.getKeyChar());
     if (arg0.getKeyChar()==currentLetter) {
    	 System.out.println("correct");
    	 panel.setBackground(Color.green);
     }
     else {  panel.setBackground(Color.red);
     }
		currentLetter = generateRandomLetter1();
		label.setText(currentLetter+"");

     }



@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
