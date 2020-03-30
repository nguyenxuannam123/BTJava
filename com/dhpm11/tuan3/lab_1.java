package com.dhpm11.tuan3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class lab_1 {

	private JFrame frame;
	private JTextField hienThi;
	private long a = 0;
	private String phepToan="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab_1 window = new lab_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public lab_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 534, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		hienThi = new JTextField();
		hienThi.setFont(new Font("Dialog", Font.BOLD, 16));
		hienThi.setHorizontalAlignment(SwingConstants.RIGHT);
		hienThi.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(hienThi, GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(hienThi, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	
		
		JPanel panel_1 = new JPanel();
		
		JButton so1 = new JButton("1");
		so1.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String gt=hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0")) gt="";
					long so = Long.parseLong(gt+so1.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
		});
		
		JButton so2 = new JButton("2");
		so2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String gt=hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0")) gt="";
					long so = Long.parseLong(gt+so2.getText());
					hienThi.setText(String.valueOf(so));
				}
				
			}
		});
		
		JButton so3 = new JButton("3");
		so3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String gt=hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0")) gt="";
					long so = Long.parseLong(gt+so3.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
		});
		
		JButton Thuong = new JButton("/");
		Thuong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a =Long.parseLong(hienThi.getText());
				if(a!=0)
				{
					phepToan="/";
					hienThi.setText("0");
				}
			}
		});
		
		JButton Sqrt = new JButton("SQRT");
		
		JButton so4 = new JButton("4");
		so4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String gt=hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0")) gt="";
					long so = Long.parseLong(gt+so4.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
		});
		
		JButton so5 = new JButton("5");
		so5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String gt=hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0")) gt="";
					long so = Long.parseLong(gt+so5.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
		});
		
		JButton so6 = new JButton("6");
		so6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String gt=hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0")) gt="";
					long so = Long.parseLong(gt+so6.getText());
					hienThi.setText(String.valueOf(so));
				}
				
			}
		});
		
		JButton Tich = new JButton("*");
		Tich.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a=Long.parseLong(hienThi.getText());
				phepToan="*";hienThi.setText("0");
			}
		});
		
		JButton PhanTram = new JButton("%");
		
		JButton so7 = new JButton("7");
		so7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String gt=hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0")) gt="";
					long so = Long.parseLong(gt+so7.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
		});
		
		JButton so8 = new JButton("8");
		so8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String gt=hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0")) gt="";
					long so = Long.parseLong(gt+so8.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
		});
		
		JButton so9 = new JButton("9");
		so9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String gt=hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0")) gt="";
					long so = Long.parseLong(gt+so9.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
		});
		
		JButton Hieu = new JButton("-");
		Hieu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a=Long.parseLong(hienThi.getText());
				phepToan="-";hienThi.setText("0");
			}
		});
		
		JButton PhanX = new JButton("1/x");
		
		JButton so0 = new JButton("0");
		so0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String gt=hienThi.getText();
				if(gt.length()<12)
				{
					if(gt.equals("0")) gt="";
					long so = Long.parseLong(gt+so0.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
			
		});
		
		JButton TongHieu = new JButton("+/-");
		
		JButton btnC = new JButton("C");
		
		JButton Tong = new JButton("+");
		Tong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a=Long.parseLong(hienThi.getText());
				phepToan="+";hienThi.setText("0");
			}
		});
		
		JButton Bang = new JButton("=");
		Bang.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(phepToan.length()>0)
				{
						long b = Long.parseLong(hienThi.getText());
						if(phepToan.equals("+")) 
						{
						long kq =a+b;
						hienThi.setText(String.valueOf(kq));
						
						}
						else if(phepToan.equals("-")){
							long kq = a-b;
							hienThi.setText(String.valueOf("kq"));
						}
						
						else if(phepToan.equals("*")){
							long kq = a*b;
							hienThi.setText(String.valueOf("kq"));
						}
						else if(phepToan.equals("/")){
							long kq = a/b;
							hienThi.setText(String.valueOf("kq"));
						}
						phepToan="";a=0;
				
				
				} 
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(1)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(so1, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
							.addComponent(so2, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
							.addComponent(so3, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
							.addComponent(Thuong, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
							.addComponent(Sqrt, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(so4, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
							.addComponent(so5, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
							.addComponent(so6, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
							.addComponent(Tich, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
							.addComponent(PhanTram, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(so7, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
							.addComponent(so8, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
							.addComponent(so9, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
							.addComponent(Hieu, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
							.addComponent(PhanX, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(so0, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
							.addComponent(TongHieu, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
							.addComponent(btnC, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
							.addComponent(Tong, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
							.addComponent(Bang, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
					.addGap(2))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(1)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(so1, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
						.addComponent(so2, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
						.addComponent(so3, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
						.addComponent(Thuong, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
						.addComponent(Sqrt, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(so4, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addComponent(so5, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addComponent(so6, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addComponent(Tich, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addComponent(PhanTram, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(so7, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addComponent(so8, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addComponent(so9, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addComponent(Hieu, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addComponent(PhanX, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(so0, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addComponent(TongHieu, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addComponent(btnC, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addComponent(Tong, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addComponent(Bang, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
					.addGap(1))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
					.addGap(20))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(29)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
					.addGap(1))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
