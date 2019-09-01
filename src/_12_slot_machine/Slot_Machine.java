package _12_slot_machine;

import java.awt.Frame;
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
	int r0 = new Random().nextInt(2);
	int r1 = new Random().nextInt(2);
	int r2 = new Random().nextInt(2);
	JButton b = new JButton();
public static void main(String[] args) {
	Slot_Machine s = new Slot_Machine();
	s.randoms();
    s.createUI();
}
 void createUI() {
	JFrame f= new JFrame();
	JPanel p= new JPanel();
	p.add(b);
	f.add(p);
	f.setVisible(true);
	f.pack();
	b.addActionListener(this);
}
public void actionPerformed(ActionEvent arg0) {
  if (arg0.getSource()==b) {
	  r0=new Random().nextInt(2);
	  r1=new Random().nextInt(2);
	  r2=new Random().nextInt(2);

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
			JLabel cherry=createLabelImage("cherry.jpg");
		} 

		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	if (r0==1) {
		try { 
			JLabel lemon= createLabelImage("lemon.png");
		}
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
	}
		if (r0==2) {
			try { 
				JLabel seven= createLabelImage("seven.png");
			}
			catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		
}
}

if (r1==0) {
	try {
		JLabel cherry=createLabelImage("cherry.jpg");
	} 

	catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
if (r1==1) {
	try { 
		JLabel lemon= createLabelImage("lemon.png");
	}
	catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
}
}
	if (r1==2) {
		try { 
			JLabel seven= createLabelImage("seven.png");
		}
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	
}
}

if (r2==0) {
	try {
		JLabel cherry=createLabelImage("cherry.jpg");
	} 

	catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
if (r2==1) {
	try { 
		JLabel lemon= createLabelImage("lemon.png");
	}
	catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
}
}
	if (r2==2) {
		try { 
			JLabel seven= createLabelImage("seven.png");
		}
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	
}
}
}
}



