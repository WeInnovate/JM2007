package com.jm2007.learn.jdbc.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUsingStatementFromUserInBatch {

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
				stmt.addBatch("INSERT INTO JM2007_USER VALUES("+id+", '"+name+"');");
				
				System.out.print("Do you want to continue(Y/N)? ");
				userChoice = scan.nextLine();
			}
			
			int[] arr = stmt.executeBatch();
			for (int i : arr) {
				System.out.println("Insertion successfull for "+ i +" record.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
