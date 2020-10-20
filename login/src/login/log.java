package login;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class log implements ActionListener{
	private JLabel label;
	private JLabel label2;
	private JFrame frame;
	private JButton button; 
	private JPanel panel;
	private JTextField text1;
	public log() {
		
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton("login");
		text1= new JTextField(10);
		label = new JLabel();
		panel.setBorder(BorderFactory.createEmptyBorder(250, 250, 300, 250)); //nelle parentesi ci va un border object che può essere fatto in questo modo <-
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(text1);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("prima GUI");
		frame.pack();
		frame.setVisible(true);
		button.setBounds(100, 120, 200, 50);
		
		button.addActionListener(this);
		
		
		
		
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new log();

	}














	@Override
	public void actionPerformed(ActionEvent e) {
		label2= new JLabel("wrong password");
		String var = text1.getText();
		//String val = "prova";
		//System.out.println(var);
		if(var.equals("prova")) {
			label.setText("login succesful");
		}
		else {
			label.setText("wrong password");
		}
		
	}

}
