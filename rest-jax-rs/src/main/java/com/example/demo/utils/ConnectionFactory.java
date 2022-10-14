package com.example.demo.utils;

import java.sql.*;
import java.util.ResourceBundle;

public class ConnectionFactory {
	public static Connection getMyOracleConnection() {
		
		Connection con =null;
		
		ResourceBundle bundle = ResourceBundle.getBundle("application");
		
		String url= bundle.getString("datasource.url");
		String userName= bundle.getString("datasource.username");
		String password= bundle.getString("datasource.password");
		
		//System.out.println(url + userName + password);
		try {
			con  =  DriverManager.getConnection(url,userName,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

}
