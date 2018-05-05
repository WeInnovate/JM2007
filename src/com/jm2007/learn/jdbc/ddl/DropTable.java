package com.jm2007.learn.jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {
	public static void main(String[] args) {

		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			stmt.execute("DROP TABLE JM2007_USER3");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
