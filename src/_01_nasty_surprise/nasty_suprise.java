package _01_nasty_surprise;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nasty_suprise implements ActionListener {
	JButton b = new JButton("Trick");
	JButton b2 = new JButton("Treat");
public static void main(String[] args) {
	nasty_suprise n = new nasty_suprise();
	n.createUI();
	
}
void createUI(){
	JFrame f = new JFrame();
	JPanel p = new JPanel();


	f.add(p);
	p.add(b);
	p.add(b2);
	f.setPreferredSize(new Dimension(450, 250));
	p.setPreferredSize(new Dimension(450,250));
	b.setPreferredSize(new Dimension(200,200));
	b2.setPreferredSize(new Dimension(200,200));
	b.addActionListener(this);
	b2.addActionListener(this);
	f.setVisible(true);
	f.pack();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if (arg0.getSource()==b) {
		showPictureFromTheInternet("http://static-23.sinclairstoryline.com/resources/media/d60d4f1c-9fcc-4ae4-8058-05e885080e19-large16x9_momo2.PNG?1551379953599");
	}
	if (arg0.getSource()==b2) {
		showPictureFromTheInternet("https://media2.s-nbcnews.com/j/newscms/2017_41/2186831/171012-putin-puppy-mc-920_285243bfb83a90f6c01d626dadcce564.fit-760w.JPG");
	}
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}

}

