package com.dhpm11.tuan4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


//import com.mysql.cj.xdevapi.PreparableStatement;




public class note {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("Get connection ... ");
		 
	      Connection conn = ketnoiMysql.getMySQLConnection();
	     System.out.println("Get connection " + conn);
	 
	      System.out.println("Done!");
	      
		Statement statement = conn.createStatement();
		String sql = "Select * from SinhVien1";
		SinhVien sv = new SinhVien();
		sv.setId(222);
		sv.setAddress("555");
		sv.setGender("nam");
		sv.setName("Thuong");
		sv.setSubject("TS");
		sv.setKnowlege("TN");
	
//		String insert = "INSERT INTO SinhVien1 VALUES (" +sv.getId()+',' +'"'+ sv.getName()+'"'+','+'"' +sv.getAddress()+'"'+','+'"' +sv.getGender()+'"'+','+'"' + sv.getKnowlege()+'"'+',' +'"'+ sv.getSubject()+'"'+")";

//		System.out.println(insert);
//		statement.executeUpdate(insert); //insert vs update
//		statement.executeUpdate(insert);
		
		
//		String select = "select * from SinhVien1";
//		statement.executeQuery(select); /// select
//		ResultSet rs = statement.executeQuery(sql);
//		while (rs.next()) {
//	          int empId = rs.getInt(1);
//	          String empNo = rs.getString(2);
//	          String empName = rs.getString(3);
//	          System.out.println("--------------------");
//	          System.out.println("EmpId:" + empId);
//	          System.out.println("EmpNo:" + empNo);
//	          System.out.println("EmpName:" + empName);
		conn.close();
	      }

	}



