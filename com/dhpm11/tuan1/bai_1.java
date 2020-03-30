package com.dhpm11.tuan1;
	
import java.util.Scanner;
public class bai_1 {

	public static void main(String[] args) {
	 	//bai1_1();
	 	//bai1_2();
		//bai1_3();
		bai1_4(4,8,8);
	
	}
	public static Scanner bb = new Scanner(System.in);	

	public static void bai1_1() // nhap xuat ten va diem sinh vien
	{
		System.out.println("Ho va ten");
		String name = bb.nextLine();
		System.out.println("diem");
		double diem = bb.nextDouble(); 
		System.out.println("Ho va ten: "+ name );
		System.out.println("diem: "+ diem  );
	}
	
	public static void bai1_2() //tinh s,p,canh nho nhat hinh chu nhat
	{
		System.out.println("dai: ");
		double dai = bb.nextDouble();
		System.out.println("rong: ");
		double rong = bb.nextDouble();
		double p = (dai+rong)*2;
		double s = dai*rong;
		double canhnho = Math.min(dai,rong);
		System.out.println("Chu Vi : "+ p );
		System.out.println("Dien tich: "+ s);
		System.out.println("Canh nho nhat:"+ canhnho);
		
	}
	public static void bai1_3()//tinh the tich 
	{
		System.out.println("nhap canh");
		double canh = bb.nextDouble();
		double thetich = Math.pow(canh,3);
		System.out.println("the tich lap phuong: "+thetich);
		
	}
	public static void bai1_4(float a,float b, float c)//tinh phuong trinh bac 2
	{
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
		float delta = b*b- 4 * a * c;
		if (delta > 0)
		{
          float  x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
          float  x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
          System.out.println("nghiem x1: "+x1 +"nghiem x2"+x2);
		}
		else if(delta==0)
		{
		 float x = (-b / (2 * a));
		 System.out.println("co nghiem kep : "+x);
		}
		else
		{
			System.out.println("phuong trinh vo nghiem");
		}
		
	}
}
