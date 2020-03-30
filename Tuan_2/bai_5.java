package Tuan_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.StyledEditorKit.BoldAction;


public class bai_5 extends JFrame{
	public bai_5()
	{
		super("Bai 5 ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Tạo Panel;
		JPanel pn = new JPanel();
		pn.setLayout(new BorderLayout());
		
		//Layout North
		JPanel pnNorth = new JPanel();
		pnNorth.setBackground(Color.gray);
		pn.add(pnNorth,BorderLayout.NORTH);
		
		JLabel text = new JLabel("Giải Phương trình bậc 2: ");
		Font font = new Font("Arial",Font.BOLD,50);
		pnNorth.add(text);
		pnNorth.setFont(font);
		
		/////////////////////////////////////////////////////////////////////
		//Layout center..
		JPanel pnCenter = new JPanel();
		pn.add(pnCenter,BorderLayout.CENTER);
		Border bor=BorderFactory.createLineBorder(Color.RED);
		TitledBorder titlebor=new TitledBorder(bor, "Nhap a,b,c:");
		pnCenter.setBorder(titlebor);
		
		JPanel textfield = new JPanel();
		textfield.setLayout(new BoxLayout(textfield,BoxLayout.Y_AXIS));
		
		JPanel flow = new JPanel();
		flow.setLayout(new FlowLayout());
		JLabel lblSoa = new JLabel("A: ");
		JTextField txtSoa = new JTextField(15);
		flow.add(lblSoa);flow.add(txtSoa);
		textfield.add(flow);
		
		
		JPanel flow1 = new JPanel();
		flow.setLayout(new FlowLayout());
		JLabel lblSob = new JLabel("B: ");
		JTextField txtSob = new JTextField(15);
		flow1.add(lblSob);flow1.add(txtSob);
		textfield.add(flow1);
		
		
		JPanel flow2 = new JPanel();
		flow2.setLayout(new FlowLayout());
		JLabel lblSoc = new JLabel("C: ");
		JTextField txtSoc = new JTextField(15);
		flow2.add(lblSoc);flow2.add(txtSoc);
		textfield.add(flow2);
		
		JLabel lblketqua = new JLabel(" Kết quả : ");
		JTextField txtketqua= new JTextField(15);
		txtketqua.setEditable(false);
		textfield.add(lblketqua);
		textfield.add(txtketqua);
		
		
		pnCenter.add(textfield);
	
		
		/////////////////////////////////////////////////////////////
		
//		Layout South...
		JPanel pnSouth = new JPanel();
		pn.add(pnSouth,BorderLayout.SOUTH);
		Border bor2 =BorderFactory.createLineBorder(Color.blue);
		TitledBorder titledbor2= new TitledBorder(bor2,"Chon thao tac: ");
		pnSouth.setBorder(titledbor2);
		
		JPanel bnSouth = new JPanel();
		bnSouth.setLayout(new FlowLayout());
		JButton btnGiai = new JButton("Giải ");
		JButton btnXoaTrang = new JButton("Xóa trắng ");
		JButton btnThoat = new JButton("Thoát ");
		bnSouth.add(btnGiai);
		bnSouth.add(btnXoaTrang);
		bnSouth.add(btnThoat);
		pnSouth.add(bnSouth);
	
		Container com = getContentPane();
		com.add(pn);
		
		/////////////////////////////////////////////////////////////////////////
	}
	public static void main(String [] args )
	{
		bai_5 frame = new bai_5();
		frame.setSize(400, 300); 	
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
	}

}
