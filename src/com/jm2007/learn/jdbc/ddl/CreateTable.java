package com.jm2007.learn.jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {

		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			stmt.execute("CREATE TABLE JM2007_USER3(ID NUMBER, NAME VARCHAR(200));");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
