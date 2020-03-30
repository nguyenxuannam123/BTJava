package com.dhpm11.tuan2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bai_2 extends JFrame {
	public Bai_2()
	{
		super("Demo Window");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		///Jpanel....
		
		JPanel br = new JPanel();
		br.setLayout(new FlowLayout());
		br.setBackground(Color.blue);
		JButton btn1 = new JButton("FLowLayout");
		JButton btn2 = new JButton("Add cac control");
		JButton btn3 = new JButton("Tren 1 dong");
		JButton btn4 = new JButton("Het cho chua");
		JButton btn5 = new JButton("Thi xuong dong");
		br.add(btn1);br.add(btn2);br.add(btn3);br.add(btn4);br.add(btn5); /// add vao doi tuong cua JPanel
		
		Container con = getContentPane();
		con.add(br);
		
		
	}

	public static void main(String[] args) {
		Bai_2 ok = new Bai_2();
		ok.setSize(400,600);
		ok.setVisible(true);
		ok.setLocationRelativeTo(null);

	}

}
