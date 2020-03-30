package com.dhpm11.tuan4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import com.dhpm11.tuan4.SinhVien;
import com.dhpm11.tuan4.ketnoiMysql;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Test {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtAddress;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
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
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.RED);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel lblAddress = new JLabel("Address");
		
		JLabel lblGender = new JLabel("Gender");
		
		JLabel lblName = new JLabel("Name");
		
		JLabel lblKnow = new JLabel("Knowledge");
		
		JLabel lblDssd = new JLabel("Subject");
		
		txtName = new JTextField();
		txtName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		
		JRadioButton rdMale = new JRadioButton("Male");
		buttonGroup.add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("Female");
		buttonGroup.add(rdFemale);
		
		JCheckBox chbJava = new JCheckBox("Java");
		
		JCheckBox chbPython = new JCheckBox("Python");

		JComboBox cbSubject = new JComboBox();
		cbSubject.setModel(new DefaultComboBoxModel(new String[] {"Management", "i don't know ...", "^_^ ", "<3"}));
		
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					System.out.println("Get connection ... ");
					 
				      Connection conn = ketnoiMysql.getMySQLConnection();
				     System.out.println("Get connection " + conn);
				 
				      System.out.println("Done!");
					String name =txtName.getText();				///name
					String address =txtAddress.getText();		///Địa chỉ
					
					String sex ="";			///gioi tinh
					if(rdMale.isSelected())
					{
						sex = "Male";
					}
					else 
					{
						sex ="FeMale";
					}
					////checkboxxxx..............................
					String knowledge = "";
					if(chbJava.isSelected())
					{
						knowledge += "Java";
					}
					
					if(chbPython.isSelected())
					{
						knowledge += " Python";
					}
					/////////////////////////////////////////////////////////////////
					String subject= cbSubject.getSelectedItem().toString();
					
					System.out.println(name+address+sex+knowledge+subject);
					
					Statement statement = conn.createStatement();
					//String sql = "Select * from SinhVien1";
					SinhVien sv = new SinhVien(name,address,sex,knowledge,subject);
				
					String insert = "INSERT INTO SinhVien1 (`name`, `address`, `gender`, `knowlege`, `subject`) VALUES (" +'"'+ sv.getName()+'"'+','+'"' +sv.getAddress()+'"'+','+'"' +sv.getGender()+'"'+','+'"' + sv.getKnowlege()+'"'+',' +'"'+ sv.getSubject()+'"'+")";
					System.out.println(insert);
					statement.executeUpdate(insert);
					conn.close();
					
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
			}
		});
		
		JButton btnReset = new JButton("Reset");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(76)
					.addComponent(lblDssd, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
					.addGap(55)
					.addComponent(cbSubject, 0, 141, Short.MAX_VALUE)
					.addGap(112))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(100)
					.addComponent(btnSave, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
					.addGap(52)
					.addComponent(btnReset, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
					.addGap(114))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGap(76)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblName, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
						.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
					.addGap(55)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtAddress, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
						.addComponent(txtName, Alignment.TRAILING))
					.addGap(129))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGap(76)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblGender, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
							.addGap(55)
							.addComponent(rdMale, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
							.addGap(12)
							.addComponent(rdFemale, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblKnow, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
							.addGap(37)
							.addComponent(chbJava, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
							.addGap(12)
							.addComponent(chbPython, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
					.addGap(70))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(2)
							.addComponent(lblName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(2))
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(17)
							.addComponent(lblAddress))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(15)
							.addComponent(txtAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(rdFemale, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(4)
							.addComponent(lblGender, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(4))
						.addComponent(rdMale, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(4)
							.addComponent(lblKnow, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(4))
						.addComponent(chbJava)
						.addComponent(chbPython, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(3)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(lblDssd, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(4))
						.addComponent(cbSubject, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSave, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnReset, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(26))
		);
		panel.setLayout(gl_panel);
	}
}
