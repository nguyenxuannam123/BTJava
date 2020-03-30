package Tuan_1;

import java.util.Scanner;

public class bai_2 {

	public static void main(String[] args) {
	System.out.println("MENU");
	System.out.println("+-----------------+");
	System.out.println("1.Giải phương trình bật 1 ");
	System.out.println("2.Giải phương trình bật 2 ");
	System.out.println("3.tính tiền điện ");
	System.out.println("4.Thoát");
	System.out.println("+-----------------+");
	
	int chon=0;
	System.out.print("Chon so :");
	chon = at.nextInt();
	switch(chon)
		{
			case 1:
			{
				
				System.out.print("nhap a: ");
				float a = at.nextFloat();
				System.out.print("nhap b: ");
				float b = at.nextFloat();
				pTBac1( a, b);
				break;
			}
			case 2:
			{
				System.out.print("nhap a: ");
				float a = at.nextFloat();
				System.out.print("nhap b: ");
				float b = at.nextFloat();
				System.out.print("nhap c: ");
				float c = at.nextFloat();
				pTBac2();
				break;
			}
			case 3:
			{
				System.out.println("nhap so dien: ");
				float dien = at.nextFloat();
				tienDien();
				break;
			}
			case 4:
			{
				System.exit(0);
				break;
				
			}
			default:
			{
				System.out.println("vui lòng nhập lại");
				break;
			}
		}
		 
	}
	public static Scanner at = new Scanner(System.in);
	public static void pTBac1(float a,float b)
	{
		if(a==0)
		{
			if(b==0)
			{
				System.out.println("Phuong trình vô số nghiệm");
			}
			else
			{
				System.out.println("phuong trình vô nghiệm");
			}		
		}
		else
		{
			System.out.println("nghiem bang = "+(-b/a));
		}
	}
	public static void pTBac2()
	{
		System.out.print("nhap a ");
		double a = at.nextDouble();
		System.out.print("nhap b ");
		double b = at.nextDouble();
		System.out.print("nhap c ");
		double c = at.nextDouble();
		if(a==0)
		{
			if(b==0)
			{
				System.out.println("Phuong trinh vo nghiem");
			}
			else
			{
				System.out.println("phuong trinh co 1 nghien x: "+(-c/b));
			}
	
		}
		double delta = b*b- 4 * a * c;
		if (delta > 0)
		{
          double  x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
          double  x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
          System.out.println("nghiem x1: "+x1 +"nghiem x2"+x2);
		}
		else if(delta==0)
		{
		 double x = (-b / (2 * a));
		 System.out.println("co nghiem kep : "+x);
		}
		else
		{
			System.out.println("phuong trinh vo nghiem");
		}
	}
	public static void tienDien()
	{
		System.out.print(" nhap so dien: ");
		int dien = at.nextInt();
		if(dien<50)
		{
			System.out.println("So tien dien dong la : "+(dien*1000));
		}
		else
		{
			System.out.println("so tien dien dong la: "+(dien*1200));
		}
	}

}
