package _01_nasty_surprise;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class nasty_suprise {
public static void main(String[] args) {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	JButton b2 = new JButton();

	f.add(p);
	p.add(b);
	p.add(b2);
	f.setPreferredSize(new Dimension(450, 250));
	p.setPreferredSize(new Dimension(450,250));
	b.setPreferredSize(new Dimension(200,200));
	b2.setPreferredSize(new Dimension(200,200));
	f.setVisible(true);
	f.pack();

}
}
