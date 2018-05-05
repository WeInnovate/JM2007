package com.jm2007.learn.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUsingStatementFromUser {

	public static void main(String[] args) {
		try {
			// 1. Create the database connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create statement/command
			Statement stmt = con.createStatement();

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";

			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Enter user ID: ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Enter user name: ");
				String name = scan.nextLine();

				// 3. Execute the statement/command
				int i = stmt.executeUpdate("INSERT INTO JM2007_USER VALUES("+id+", '"+name+"');");
				if (i > 0) {
					System.out.println(i + " Record inserted successfully.");
				}
				
				System.out.print("Do you want to continue(Y/N)? ");
				userChoice = scan.nextLine();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
