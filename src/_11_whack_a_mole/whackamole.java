package _11_whack_a_mole;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whackamole {
JFrame frame= new JFrame();
JPanel panel= new JPanel();
public static void main(String[] args) {
	whackamole bob= new whackamole();
	bob.draw();
}
void draw(){
	for (int i = 0; i < 24; i++) {
		JButton button=new JButton();
		panel.add(button);
	} 
	frame.add(panel);
	frame.setPreferredSize(new Dimension (800,800));
	frame.setVisible(true);
	frame.pack();
}
}
