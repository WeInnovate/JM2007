package com.jm2007.learn.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUsingStatement {

	public static void main(String[] args) {
		try {
			// 1. Create the database connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create statement/command
			Statement stmt = con.createStatement();
			// 3. Execute the statement/command
			int i = stmt.executeUpdate("DELETE FROM JM2007_USER WHERE ID = 4");
			if (i > 0) {
				System.out.println(i + " Record deleted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
