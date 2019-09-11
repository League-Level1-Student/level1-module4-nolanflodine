package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Horse implements ActionListener {
	JFrame f = new JFrame();
	JPanel p= new JPanel();
	JButton b=new JButton("Joke");
	JButton b2=new JButton("Punchline");
public static void main(String[] args) {
	Horse h = new Horse();
	h.method();
}
void method(){
	f.add(p);
	p.add(b);
	p.add(b2);
	f.setVisible(true);
	b.addActionListener(this);
	b2.addActionListener(this);
	f.pack();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if (arg0.getSource()==b) {
		JOptionPane.showMessageDialog(null, "An alien lands on a roof...");
	}
	if (arg0.getSource()==b2) {
		JOptionPane.showMessageDialog(null, "Horse");
	}
}
}
