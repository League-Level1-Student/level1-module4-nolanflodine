package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slot_Machine implements ActionListener {
	JFrame f= new JFrame();
	JPanel p= new JPanel();
	JButton b = new JButton();
	int r0 = new Random().nextInt(2);
	int r1 = new Random().nextInt(2);
	int r2 = new Random().nextInt(2);
public static void main(String[] args) {
	Slot_Machine s = new Slot_Machine();
}
void createUI() {
	b.addActionListener(this);
}
public void actionPerformed(ActionEvent arg0) {
  if (arg0.getSource()==b) {
	  
  }
}

private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}
void randoms() {
	if (r0==0) {
		try {
			JLabel l=createLabelImage("Cherry.jpeg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
