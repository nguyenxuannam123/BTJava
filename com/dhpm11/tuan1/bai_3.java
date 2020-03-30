package com.dhpm11.tuan1;

import java.util.Scanner;

public class bai_3 {

	public static void main(String[] args) {
		
		//soNguyenTo();
		//phepNhan();
		bangCuuChuong();
	}
	public static Scanner ub = new Scanner(System.in);
	
	public static void soNguyenTo()
	{
		System.out.print("nhap so: ");
		double ok = ub.nextDouble();
		boolean gh= true;
		for(int i=2;i<ok-1;i++)
		{
			if(ok%i==0)
			{
				gh=false;
				break;
			}
		}
		System.out.println("bien "+gh);
	}
	public static void phepNhan()
	{
		System.out.print("Nhập bảng cửu chương số mấy ");
		int br = ub.nextInt();
		for(int i=0;i<=10;i++)
		{
			System.out.printf("%d x %d = %d", br, i, br*i);System.out.println();
		}
	
	}
	public static void bangCuuChuong()
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=0;j<=10;j++)
			{
				System.out.printf("%d x %d = %d",i,j,i*j);System.out.println();
			}
		}
	}
	
	

}
