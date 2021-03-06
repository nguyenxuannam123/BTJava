package com.dhpm11.tuan4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;



import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class lab_1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtNo;
	private JTextField txtEmail;
	private JTextField txtRemarks;
	private JTable table;
	private DefaultTableModel tm;
	JCheckBox chbBook;
	JCheckBox chbPape;
	JCheckBox chbJoMa;
	JScrollPane scrollPane = new JScrollPane();
	private Connection connB= MySQlBookSuppliers.getMySQLConnection();;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab_1 frame = new lab_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void loadData() throws SQLException
	{
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Address", "Type", "No", "Email", "Remarks"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(4).setResizable(false);
		
		
		tm=(DefaultTableModel)table.getModel();
		Object rowData[]=new Object[7];
		String select ="select* from Book";
		PreparedStatement pst=connB.prepareStatement(select);
		ResultSet rs = pst.executeQuery(select);
			while(rs.next())
			{
				 rowData[0] = rs.getString(1);
				 rowData[1] = rs.getString(2);
				 rowData[2] = rs.getString(3);
				 rowData[3] = rs.getString(4);
				 rowData[4] = rs.getString(5);
				 rowData[5] = rs.getString(6);
				 rowData[6] = rs.getString(7);
				tm.addRow(rowData);
			}
			
			table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
				@Override
				public void valueChanged(ListSelectionEvent arg0) {
					System.out.println("Okbabe");
					String id=table.getValueAt(table.getSelectedRow(), 0).toString();
					txtID.setText(id);
					String name=table.getValueAt(table.getSelectedRow(), 1).toString();
					txtName.setText(name);
					String address=table.getValueAt(table.getSelectedRow(), 2).toString();
					txtAddress.setText(address);
					String no=table.getValueAt(table.getSelectedRow(), 4).toString();
					txtNo.setText(no);
					String email=table.getValueAt(table.getSelectedRow(), 5).toString();
					txtEmail.setText(email);
					String remarks=table.getValueAt(table.getSelectedRow(), 6).toString();
					txtRemarks.setText(remarks);
					String[] type=table.getValueAt(table.getSelectedRow(), 3).toString().split("-");

					chbBook.setSelected(false);
					chbPape.setSelected(false);
					chbJoMa.setSelected(false);
					
					for(int i=0;i<type.length;i++)
					{
						if(type[i].trim().equals("Book"))
						{
							chbBook.setSelected(true);
						}
						if(type[i].trim().equals("Journals and Magazines"))
						{
							chbJoMa.setSelected(true);
						}
						if(type[i].trim().equals("New Papers"))
						{
							chbPape.setSelected(true);
						}
						
						
					}
				}
			});
	}
	
	public lab_1() throws ClassNotFoundException, SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("OptionPane.questionDialog.titlePane.shadow"));
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 5, 631, 26);
		contentPane.add(panel);
		
		JLabel lblBookSuppliers = new JLabel("BOOK SUPPLIERS");
		panel.add(lblBookSuppliers);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 31, 626, 216);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblID = new JLabel("Suppliers ID");
		lblID.setBounds(12, 12, 83, 15);
		panel_1.add(lblID);
		
		JLabel lblName = new JLabel("Suppliers Name");
		lblName.setBounds(250, 12, 114, 15);
		panel_1.add(lblName);
		
		JLabel lblType = new JLabel("Suppliers Type");
		lblType.setBounds(12, 39, 119, 15);
		panel_1.add(lblType);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(12, 66, 66, 15);
		panel_1.add(lblAddress);
		
		JLabel lblContactNo = new JLabel("ContactNo");
		lblContactNo.setBounds(12, 93, 96, 15);
		panel_1.add(lblContactNo);
		
		JLabel lblEmailID = new JLabel("Email ID");
		lblEmailID.setBounds(12, 120, 96, 15);
		panel_1.add(lblEmailID);
		
		JLabel lblRemarks = new JLabel("Remarks");
		lblRemarks.setBounds(12, 147, 83, 15);
		panel_1.add(lblRemarks);
		
		txtID = new JTextField();
		txtID.setBounds(126, 10, 106, 19);
		panel_1.add(txtID);
		txtID.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(370, 10, 161, 17);
		panel_1.add(txtName);
		txtName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(126, 64, 405, 19);
		panel_1.add(txtAddress);
		txtAddress.setColumns(10);
		
		txtNo = new JTextField();
		txtNo.setBounds(126, 91, 204, 19);
		panel_1.add(txtNo);
		txtNo.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(126, 118, 405, 19);
		panel_1.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtRemarks = new JTextField();
		txtRemarks.setBounds(108, 147, 423, 57);
		panel_1.add(txtRemarks);
		txtRemarks.setColumns(10);
		
		chbBook = new JCheckBox("Book");
		chbBook.setBounds(145, 35, 77, 23);
		panel_1.add(chbBook);
		
		chbPape = new JCheckBox("News Papers");
		chbPape.setBounds(238, 35, 126, 23);
		panel_1.add(chbPape);
		chbJoMa = new JCheckBox("Journals and Magazines");
		chbJoMa.setBounds(368, 35, 186, 23);
		panel_1.add(chbJoMa);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(5, 247, 433, 37);
		contentPane.add(panel_2);
		loadData();
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtAddress.setText("");
				txtEmail.setText("");
				txtID.setText("");
				txtName.setText("");
				txtNo.setText("");
				txtRemarks.setText("");
				chbBook.setSelected(false);
				chbJoMa.setSelected(false);
				chbPape.setSelected(false);
				
			}
		});
		btnNew.setForeground(Color.RED);
		btnNew.setBackground(Color.BLUE);
		panel_2.add(btnNew);
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(5, 288, 626, 95);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		scrollPane.setBounds(0, 0, 626, 83);
		panel_3.add(scrollPane);
		
		
		JButton btnSave = new JButton("Save"); //nut save	
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
							
					String id = txtID.getText();
					String name=txtName.getText();
					String address=txtAddress.getText();
					String no=txtNo.getText();
					String email=txtEmail.getText();
					String remarks=txtRemarks.getText();
					String type="";
					if(chbBook.isSelected())
					{
						type +="Book ";
					}
					if(chbPape.isSelected())
					{
						if(chbBook.isSelected())
						{
							type +="-New Papers ";
						}
						else
						{
							type +=" New Papers ";
						}
						
					}
					if(chbJoMa.isSelected())
					{
						
						if(chbBook.isSelected() || chbPape.isSelected())
						{
							type +="-Journals and Magazines";
						}
						else
						{
							type +="Journals and Magazines";
						}
					}
					
					
					System.out.println(id+name+address+no+email+remarks+type);
					
					
				     System.out.println("Get connection " + connB);
				     Statement statement =connB.createStatement(); //ket nối với mySQL
				     
				     lab_1st  bk=new lab_1st(id,name,address,no,email,remarks,type);

				     String insert ="INSERT INTO Book (ID, Name, Address, Type, No, Email, Remarks) VALUES (?,?,?,?,?,?,?)";
				     PreparedStatement statement2 =connB.prepareStatement(insert);
					
					statement2.setString(1, bk.getID());
					statement2.setString(2, bk.getName());
					statement2.setString(3, bk.getAddress());
					statement2.setString(4, bk.getType());
					statement2.setString(5, bk.getNo());
					statement2.setString(6, bk.getEmail());
					statement2.setString(7, bk.getRemarks());
					
		
//					System.out.println(bk.getID() + txtID.getText());
					statement2.executeUpdate();
				//	statement2.executeBatch();
					loadData();
					
				}  catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				
				
			}
		});
		btnSave.setBackground(Color.GREEN);
		panel_2.add(btnSave);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = txtID.getText();
				String delete="delete from Book where ID ="+'"' +id+'"';
				
				try {
					System.out.println(delete);
					PreparedStatement statement=connB.prepareStatement(delete);
				    statement.execute();
				    loadData();
				}  catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			     
			}
		});
		btnDelete.setForeground(Color.RED);
		btnDelete.setBackground(Color.BLUE);
		panel_2.add(btnDelete);
		

		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String id = txtID.getText();
					String name=txtName.getText();
					String address=txtAddress.getText();
					String no=txtNo.getText();
					String email=txtEmail.getText();
					String remarks=txtRemarks.getText();
					String type="";
					if(chbBook.isSelected())
					{
						type +="Book ";
					}
					if(chbPape.isSelected())
					{
						if(chbBook.isSelected())
						{
							type +="-New Papers ";
						}
						else
						{
							type +=" New Papers ";
						}
						
					}
					if(chbJoMa.isSelected())
					{
						
						if(chbBook.isSelected() || chbPape.isSelected())
						{
							type +="-Journals and Magazines";
						}
						else
						{
							type +="Journals and Magazines";
						}
					}
					
					
					String sql = "UPDATE Book SET ID=?, Name=?, Address=?, Type=?, No=?, Email=?, Remarks= ? WHERE ID=? ";
					lab_1st  bk=new lab_1st(id,name,address,no,email,remarks,type);
					
					PreparedStatement statement =connB.prepareStatement(sql);
					
					statement.setString(1, bk.getID());
					statement.setString(2, bk.getName());
					statement.setString(3, bk.getAddress());
					statement.setString(4, bk.getType());
					statement.setString(5, bk.getNo());
					statement.setString(6, bk.getEmail());
					statement.setString(7, bk.getRemarks());
					statement.setString(8, txtID.getText());
					System.out.println(bk.getID() + txtID.getText());
					statement.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		btnUpdate.setBackground(Color.GREEN);
		panel_2.add(btnUpdate);
		
		
		
		
	}
}
