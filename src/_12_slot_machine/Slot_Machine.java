package _12_slot_machine;

import java.awt.Dimension;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Slot_Machine implements ActionListener {
	int r0 = new Random().nextInt(3);
	int r1 = new Random().nextInt(3);
	int r2 = new Random().nextInt(3);
	JLabel cherry;
	JLabel lemon;
	JLabel seven;
	JButton b = new JButton();
	JPanel p= new JPanel();
	JFrame f= new JFrame();


public static void main(String[] args) {
	Slot_Machine s = new Slot_Machine();
    s.createUI();
}
 void createUI() {
	p.add(b);
	f.add(p);
	f.setVisible(true);
	b.addActionListener(this);


	try {
		 cherry=createLabelImage("Cherry2.png");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		 lemon= createLabelImage("Lemon3.png");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		 seven= createLabelImage("Seven2.png");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	cherry.setPreferredSize(new Dimension(400,400));
	lemon.setPreferredSize(new Dimension(400,400));
	seven.setPreferredSize(new Dimension(400,400));
p.add(cherry);
p.add(lemon);
p.add(seven);
f.pack();
}
public void actionPerformed(ActionEvent arg0) {
  if (arg0.getSource()==b) {
	  r0=new Random().nextInt(3);
	  r1=new Random().nextInt(3);
	  r2=new Random().nextInt(3);
	  randoms();
	  if (r0==0&&r1==0&&r2==0||r0==1&&r1==1&&r2==1||r0==3&&r1==3&&r2==3) {
		  JOptionPane.showMessageDialog(null, "You done did a win!");
	  }
	  
	  

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
	JLabel cherry2 = new JLabel();
	JLabel lemon2= new JLabel();
	JLabel seven2= new JLabel();



	
	p.removeAll();
	if (r0==0) {
		try {
			  cherry2=createLabelImage("Cherry2.png");
		} 

		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	if (r0==1) {
		try { 
			  cherry2= createLabelImage("Lemon3.png");
		}
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
	}
		if (r0==2) {
			try { 
				  cherry2= createLabelImage("Seven2.png");
			}
			catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		
}
}

if (r1==0) {
	try {
		 lemon2=createLabelImage("Cherry2.png");
	} 

	catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
if (r1==1) {
	try { 
		 lemon2= createLabelImage("Lemon3.png");
	}
	catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
}
}
	if (r1==2) {
		try { 
			 lemon2= createLabelImage("Seven2.png");
		}
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	
}
}

if (r2==0) {
	try {
		 seven2=createLabelImage("Cherry2.png");
	} 

	catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
if (r2==1) {
	try { 
		 seven2= createLabelImage("Lemon3.png");
	}
	catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
}
}
	if (r2==2) {
		try { 
			 seven2= createLabelImage("Seven2.png");
		}
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	
}
}
	cherry2.setPreferredSize(new Dimension(300,300));
	lemon2.setPreferredSize(new Dimension(300,300));
	seven2.setPreferredSize(new Dimension(300,300));
	p.add(b);

	p.add(cherry2);
	p.add(lemon2);
	p.add(seven2);
	
	f.pack();
}
}



