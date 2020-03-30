package com.dhpm11.tuan4;

public class SinhVien {
	
	 private int id;
	private String name;
	private String address;
	private String gender;
	private String knowlege;
	private String subject;
	
	
	
	public SinhVien() {
		super();
	}
	public SinhVien(String name, String address, String gender, String knowlege, String subject) {
		super();
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.knowlege = knowlege;
		this.subject = subject;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getGender() {
		return gender;
	}
	public String getKnowlege() {
		return knowlege;
	}
	public String getSubject() {
		return subject;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setKnowlege(String knowlege) {
		this.knowlege = knowlege;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
