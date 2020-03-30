package Tuan_2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bai_3 extends JFrame{

	public Bai_3()
	{
		super("Demo Box Layout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		JPanel ok = new JPanel();
		ok.setLayout(new BoxLayout(ok,BoxLayout.X_AXIS ));
		JButton btn1= new JButton("Box Layout");
		btn1.setForeground(Color.blue);
		Font font = new Font("Arial", Font.BOLD,25);
		btn1.setFont(font);ok.add(btn1);
		JButton btn2 = new JButton("X-Axis");
		btn2.setForeground(Color.darkGray);
		btn2.setFont(font);ok.add(btn2);
		JButton btn3= new JButton("Y-Axis");	
		btn3.setForeground(Color.GREEN);
		btn3.setFont(font);ok.add(btn3);
		
		Container con =getContentPane();
		con.add(ok);
		
		
	}
	
	
	public static void main(String[] args) {
		Bai_3 rp = new Bai_3();
		rp.setSize(400,600);
		rp.setVisible(true);
		rp.setLocationRelativeTo(null);
		

	}

}
