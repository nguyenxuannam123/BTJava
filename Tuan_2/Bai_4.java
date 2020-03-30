package Tuan_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bai_4 extends JFrame {
	
	public Bai_4()
	{
		super("Bai4");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		/////JPanel...
		JPanel ak = new JPanel();
		ak.setLayout(new BorderLayout());
		JPanel pnNorth = new JPanel();
		pnNorth.setBackground(Color.GREEN);
		ak.add(pnNorth,BorderLayout.NORTH);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setBackground(Color.black);
		ak.add(pnSouth,BorderLayout.SOUTH);
		
		JPanel pnWest = new JPanel();
		pnWest.setBackground(Color.CYAN);
		ak.add(pnWest,BorderLayout.WEST);
		
		JPanel pnEast = new JPanel();
		pnEast.setBackground(Color.LIGHT_GRAY);
		ak.add(pnEast,BorderLayout.EAST);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setBackground(Color.pink);
		ak.add(pnCenter,BorderLayout.CENTER);
		
		Container con =getContentPane();
		con.add(ak);
		
		
		
	}

	public static void main(String[] args) {
		Bai_4 bb = new Bai_4();
		bb.setSize(400,600);
		bb.setVisible(true);
		bb.setLocationRelativeTo(null);
		

	}

}
