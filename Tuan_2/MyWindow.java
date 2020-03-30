package Tuan_2;

import javax.swing.JFrame;

	public class MyWindow extends JFrame {
		public MyWindow() 
		{
			super("Demo Window");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	public static void main(String[] args)
	{
		MyWindow ui = new MyWindow();
		ui.setSize(400,600);
		ui.setVisible(true);
		ui.setLocationRelativeTo(null);
	}
	

}
