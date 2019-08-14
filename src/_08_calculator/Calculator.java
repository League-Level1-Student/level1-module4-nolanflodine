package _08_calculator;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame= new JFrame();
	JPanel panel =new JPanel();
	JButton add = new JButton("add");
	JButton sub = new JButton("sub");
	JButton mul = new JButton("mul");
	JButton div = new JButton("div");
	JTextField text3=new JTextField(4);
	JTextField text1=new JTextField(4);
	JTextField text4=new JTextField(6);
public static void main(String[] args) {
Calculator bob=new Calculator();
bob.gui();
	
}
public void gui(){
	add.addActionListener(this);
	sub.addActionListener(this);	
	mul.addActionListener(this);	
	div.addActionListener(this);	
	frame.add(panel);
	panel.add(add);
	panel.add(sub);
	panel.add(mul);
	panel.add(div);
	panel.add(text1);
	panel.add(text3);
	panel.add(text4);
	frame.setVisible(true);
	frame.pack();
	
	
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	int t4=0;
	int t1=Integer.parseInt(text1.getText());
	int t3=Integer.parseInt(text3.getText());

	
	if (arg0.getSource()==add) {
		t4=t1+t3;
	}
	if (arg0.getSource()==sub) {
		t4=t1-t3;
	}
	if (arg0.getSource()==mul) {
		t4=t1*t3;
	}
	if (arg0.getSource()==div) {
		t4=t1/t3;
	}
	text4.setText(""+t4);
}
}

