package com.dhpm11.tuan4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ketnoiMysql {

	 public static Connection getMySQLConnection() throws SQLException,
	         ClassNotFoundException {
	     String hostName = "localhost";
	 
	     String dbName = "SinhVien";
	     String userName = "thuong";
	     String password = "hl8brgameboy";
	 
	     return getMySQLConnection(hostName, dbName, userName, password);
	 }
	 
	 public static Connection getMySQLConnection(String hostName, String dbName,
	         String userName, String password) throws SQLException,
	         ClassNotFoundException {
	     String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName + "?useUnicode=true&characterEncoding=UTF-8" ;
	 
	     Connection conn = DriverManager.getConnection(connectionURL, userName,
	             password);
	     return conn;
	 }

}