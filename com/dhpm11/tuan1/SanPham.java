package com.dhpm11.tuan1;

import java.util.Scanner;

public class SanPham
{
	Scanner ok = new Scanner(System.in);
	private String sanPham;
	private double donGia;
	private double giamGia;

	
	public SanPham(String sanPham, double donGia, double giamGia) {
		this.sanPham = sanPham;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	
	public SanPham(String sanPham, double donGia) 
	{
		this.sanPham = sanPham;
		this.donGia = donGia;
	}
	public SanPham()
	{
		
	}
	

	public String getsanPham()
	{
		return sanPham;
	}


	public double getDonGia() {
		return donGia;
	}
	public double getGiamGia() {
		return giamGia;
	}

	public void setSanPham(String sanPham) {
		this.sanPham = sanPham;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	private double getthueNhapKhau()
	{
		return this.getDonGia()*0.1;
	}
	
	public void nhapSanPham()
	{
		System.out.print("Ten san pham:  ");
		String ten = ok.nextLine();
		this.setSanPham(ten);
		System.out.print("Don gia: ");
		double dongia = ok.nextDouble();
		this.setDonGia(dongia);
		System.out.print("giam gia: ");
		double giamgia=ok.nextDouble();
		this.setGiamGia(giamgia);
		
	}
	public void xuatSanPham()
	{
		System.out.println("San Pham : "+this.getsanPham());
		System.out.println("don gia : "+this.getDonGia());
		System.out.println("giam gia: "+this.getGiamGia());
		System.out.println("Thue nhap khau: "+this.getthueNhapKhau());
	}
	public void nhapmang()
	{
		Scanner hh=new Scanner(System.in);
		System.out.print(" so luong san pham : ");
		int n=hh.nextInt();
		SanPham[] a=new SanPham[n];
		for(int i=0;i<n;i++)
		{
			SanPham thumuc = new SanPham();
			thumuc.nhapSanPham();
			a[i]=thumuc;

		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Ten San Pham: "+a[i].getsanPham());
			System.out.println("Don gia "+a[i].getDonGia());
			System.out.println("giam gia: "+a[i].getGiamGia());
			System.out.println("Thue: "+a[i].getthueNhapKhau());
		
		}
	}
	



}
