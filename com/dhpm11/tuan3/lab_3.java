package com.dhpm11.tuan3;

import java.util.Scanner;

public class lab_3 {

	public static void main(String[] args) {
		/* Cach 1
		Scanner sr = new Scanner(System.in);
		System.out.println("Nhap a: ");
		double number = sr.nextDouble();
		double sqrtOfNumber = Math.sqrt(number);
		System.out.println("Can bat 2 cua A : "+sqrtOfNumber);*/
		
		//canBac2();//Cach 2
		
		//Cach 3
		/*Scanner sr = new Scanner(System.in);
		System.out.println("Nhap a: ");
		double number = sr.nextDouble();
		canBac2Cach3(number);*/
		
		//Cach 4
		/*double results = canBac2Cach4();
		System.out.println("Can bat 2 cua A : "+ results);
		System.out.println("Can bat 2 cua A : "+ canBac2Cach4());*/
		
		Scanner sr = new Scanner(System.in);
		System.out.println("Nhap a: ");
		double number = sr.nextDouble();
		System.out.println( "Can bat 2 cua A : "+canBac2Cach4(number));
	}
	
	
	public static void canBac2()
	{
		Scanner sr = new Scanner(System.in);
		System.out.println("Nhap a: ");
		double number = sr.nextDouble();
		double sqrtOfNumber = Math.sqrt(number);
		System.out.println("Can bat 2 cua A : "+sqrtOfNumber);

	}
	
	public static void canBac2Cach3(double number)
	{
		double sqrtOfNumber = Math.sqrt(number);
		System.out.println("Can bat 2 cua A : "+sqrtOfNumber);

	}
	
	public static double canBac2Cach4()
	{
		Scanner sr = new Scanner(System.in);
		System.out.println("Nhap a: ");
		double number = sr.nextDouble();
		double sqrtOfNumber = Math.sqrt(number);
		return sqrtOfNumber;
	}
	
	public static double canBac2Cach4(double number)
	{
		double sqrtOfNumber = Math.sqrt(number);
		return sqrtOfNumber;	

	}
}
