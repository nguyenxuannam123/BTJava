package Tuan_4;

public class lab_1st {
	String ID;
	String Name;
	String Address;
	String No;
	String Email;
	String Remarks;
	String Type;
	
	public String getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	public String getAddress() {
		return Address;
	}

	public String getNo() {
		return No;
	}

	public String getEmail() {
		return Email;
	}

	public String getRemarks() {
		return Remarks;
	}

	public String getType() {
		return Type;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public void setNo(String no) {
		No = no;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

	public void setType(String type) {
		Type = type;
	}

	public lab_1st() {
		super();
	}

	public lab_1st(String iD, String name, String address, String no, String email, String remarks, String type) {
		super();
		ID = iD;
		Name = name;
		Address = address;
		No = no;
		Email = email;
		Remarks = remarks;
		Type = type;
	}
	

}
