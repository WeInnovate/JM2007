package com.jm2007.learn.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

public class DatabaseUtility {

	static Connection con;

	public static Connection getCon() throws SQLException {
		if (con == null) {

			// write the code to read the value from property file
			ResourceBundle rb = ResourceBundle.getBundle("com//jm2007//learn//jdbc//dao//db", Locale.US);
			String url = rb.getString("url");
			String un = rb.getString("userName");
			String pass = rb.getString("password");

			con = DriverManager.getConnection(url, un, pass);
		}
		return con;
	}
}
